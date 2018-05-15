package bkdn.cntt.core;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.zkoss.bind.Property;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.sys.ValidationMessages;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.SimpleConstraint;
import org.zkoss.zul.mesg.MZul;

import bkdn.cntt.model.NhanVien;
import bkdn.cntt.service.NhanVienService;

public class BaseValid extends AbstractValidator {
	private static transient final Logger log = LogManager.getLogger(BaseValid.class.getName());

	@Override
	public void validate(final ValidationContext ctx) {
	    Map<String, Property> beanProps = ctx.getProperties(ctx.getProperty().getBase());
	    final ValidationMessages vmsgs = (ValidationMessages) ctx.getValidatorArg("vmsg");
        if (vmsgs != null) {
            vmsgs.clearKeyMessages(Throwable.class.getSimpleName());
            vmsgs.clearMessages(ctx.getBindContext().getComponent());
        }
        validateConstraint(ctx);
        validatePasswords(ctx);
        validateEmail(ctx);
//        validateTenDangNhap(ctx, (String) beanProps.get("tenDangNhap").getValue());
//        validateDate(ctx, (Date) beanProps.get("ngaySinh").getValue());
	}

	private boolean validateConstraint(final ValidationContext ctx) {
		boolean result;
		final Object constraint = ctx.getValidatorArg("constraint");
		if (constraint == null) {
			result = true;
		} else {
			try {
				log.info(constraint);
				Object value = ctx.getProperty().getValue();
				if(value!=null && value instanceof String){
					String temp = value.toString().trim();
					value = temp;
				}
				new SimpleConstraint(constraint.toString()).validate(null, value);
				result = true;
			} catch (final WrongValueException ex) {
				Object msg;
				Object msgid = ctx.getValidatorArg("msgid");
				if (ex.getCode() == MZul.EMPTY_NOT_ALLOWED) {
					if (msgid == null) {
						msg = "Bạn không được để trống trường này.";
					} else {
						msg = "Vui lòng nhập!";
					}
					
				} else if (ex.getCode() == MZul.NO_TODAY) {
					msg = "no today";
				} else if (ex.getCode() == MZul.NO_NEGATIVE) {
					msg = "no negative";
				} else if (ex.getCode() == MZul.NO_POSITIVE) {
					msg = "no positive";
				} else if (ex.getCode() == MZul.NO_FUTURE) {
					msg = "Không được lớn hơn ngày hiện tại";
				} else if (ex.getCode() == MZul.NO_ZERO) {
					msg = "no zero";
				} else if (ex.getCode() == MZul.NO_PAST) {
					msg = "Không được nhỏ hơn ngày hiện tại";
				} else if (ex.getCode() == MZul.NO_POSITIVE_ZERO) {
					msg = "NO_POSITIVE_ZERO";
				} else if (ex.getCode() == MZul.NO_POSITIVE_NEGATIVE_ZERO) {
					msg = "NO_POSITIVE_NEGATIVE_ZERO";
				} else if (ex.getCode() == MZul.NO_POSITIVE_NEGATIVE) {
					msg = "NO_POSITIVE_NEGATIVE";
				} else if (ex.getCode() == MZul.NO_FUTURE_TODAY) {
					msg = "NO_FUTURE_TODAY";
				} else if (ex.getCode() == MZul.NO_PAST_TODAY) {
					msg = "NO_PAST_TODAY";
				} else if (ex.getCode() == MZul.NO_FUTURE_PAST_TODAY) {
					msg = "NO_FUTURE_PAST_TODAY";
				} else if (ex.getCode() == MZul.NO_FUTURE_PAST) {
					msg = "NO_FUTURE_PAST";
				} else if (ex.getCode() == MZul.VALUE_NOT_MATCHED) {
					msg = "VALUE_NOT_MATCHED";
				} else if (ctx.getValidatorArg("cmsg") == null) {
					msg = ex.getMessage();
				} else {
					msg = ctx.getValidatorArg("cmsg");
				}
				java.util.logging.Logger.getAnonymousLogger().info(ctx.getBindContext().getComponent()+"");
				java.util.logging.Logger.getAnonymousLogger().info(ctx.getBindContext().getComponent().getId()+"");
				System.out.println("msdid: " + msgid);
				if (msgid == null) {
					addInvalidMessage(ctx, msg.toString());
				} else {
					addInvalidMessage(ctx, msgid.toString(), msg.toString());
				}
				result = false;
			}
		}
		return result;
	}

	private boolean validatePasswords(final ValidationContext ctx) {
		final Object retype = ctx.getValidatorArg("password");
		boolean result;
		if (retype == null) {
			result = true;
		} else {
			Object pass = ctx.getProperty().getValue();
			if (pass == null) {
				pass = "";
			}
			if (retype.equals(pass)) {
				result = true;
			} else {
				addInvalidMessage(ctx, "Xác nhận mật khẩu không trùng khớp!");
				result = false;
			}
		}
		return result;
	}

	private boolean validateEmail(final ValidationContext ctx) {
		String email = (String) ctx.getValidatorArg("email");
		System.out.println("Dang ký : " + email);
		boolean result;
		if (email == null || email.trim().matches(".+@.+\\.[a-z]+")) {
			result = true;
		} else {
			addInvalidMessage(ctx, "Địa chỉ email không đúng định dạng.");
			result = false;
		}
		return result;
	}
	
	private void validateTenDangNhap(final ValidationContext ctx, String tenDangNhap) {
	    if (tenDangNhap == null) {
	        this.addInvalidMessage(ctx, "Tên đăng nhập không được để trống");
	    } 
	    else if (tenDangNhap != null){
	        NhanVien nhanVien = new NhanVienService().getNhanVienByUsename(tenDangNhap);
            if (nhanVien != null) {
                this.addInvalidMessage(ctx, "Tên đăng nhập đã tồn tại");
            }
	    }
	    
	}
	
	private void validateDate(ValidationContext ctx, Date ngaySinh) {
        Date date = new Date();
        if (ngaySinh == null) {
            this.addInvalidMessage(ctx, "ngaySinh", "Ngày sinh không được để trống");
        }
        else if((date.getTime() - ngaySinh.getTime()) <= 0) {
            System.out.println("DK: " + ngaySinh);
            this.addInvalidMessage(ctx, "ngaySinh", "Ngày sinh phải trước ngày hiện tại");
        }
    }
	
	
//	private boolean validateCaptcha(final ValidationContext ctx) {
//		String captcha = (String) ctx.getValidatorArg("captcha");
//		System.out.println("captcha: " + captcha);
//		final String recaptcha = (String) ctx.getValidatorArg("recaptcha");
//		System.out.println("recaptcha: " + recaptcha);
//		
//		boolean result;
//		if (captcha != null && captcha.equals(recaptcha)) {
//			result = true;
//		} else {
//			addInvalidMessage(ctx, "captchaerr", "Mã kiểm tra không đúng.");
//			result = false;
//		}
//		System.out.println("ket qua: " + result);
//		return result;
//	}

	/*private boolean validateUnique(final ValidationContext ctx) {
		boolean result;
		final Object field = ctx.getValidatorArg("field");
		if (field == null) {
			result = true;
		} else if (ctx.getProperty().getValue() != null) {
			final Model<?> object = (Model<?>) ctx.getValidatorArg("id");
			BasicService<Object> basicService = new BasicService<>();
			JPAQuery<?> q = basicService.find(object.getClass());
			Path<?> path = (Path<?>) q
					.getMetadata().getJoins().get(0).getTarget();
			PathBuilder<?> pb = new PathBuilder<>(object.getClass(), path.getMetadata().getName());
			//Model<?> a = alias(object.getClass(), path.getMetadata().getName());
//			q = q.where($(a.getTrangThai()).ne(basicService.getCore().TT_DA_XOA))
//					.where($(a.getId()).ne(object.getId()))
			q = q.where(pb.get(QModel.model.trangThai).ne(basicService.getCore().TT_DA_XOA))
			.where(pb.get(QModel.model.id).ne(object.getId()))
					.where(Expressions.path(Object.class, path, field.toString()).eq(
							ctx.getProperty().getValue()));
			if (q.fetchCount() > 0) {
				String replaceMsgs = (String)ctx.getValidatorArg("cmsg");
				if(replaceMsgs != null || !"".equals(replaceMsgs)) {
					addInvalidMessage(ctx, replaceMsgs);
				} else {
					addInvalidMessage(ctx, "Giá trị này đã tồn tại trong hệ thống.");
				}
				
				result = false;
			} else {
				result = true;
			}
		} else {
			result = true;
		}

		return result;
	}*/
}

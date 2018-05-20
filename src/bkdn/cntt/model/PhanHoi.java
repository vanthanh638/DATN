package bkdn.cntt.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;

import bkdn.cntt.Main;
import bkdn.cntt.core.Asset;

@Entity
@Table(name="phan_hoi")
public class PhanHoi extends Asset<PhanHoi>{

	private String hoTen;
	private String email;
	private String noiDung;
	private String tieuDe;
	
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Command
	public void savePhanHoi(@BindingParam("list") final Object phanHoi){
		PhanHoi ph = (PhanHoi)phanHoi;
		ph.saveNotShowNotification();
		String subject = "Hiến máu nhân đạo "+ph.getTieuDe();
		try {
			Main.send("smtp.gmail.com", getEmail(), "vanthanh638x11@gmail.com", "01679911638", subject, "Cảm ơn bạn đã phản hồi cho chúng tôi.");
			showNotification("Cảm ơn bạn đã liên hệ, hãy đợi câu trả lời của chúng tôi nhé !", "", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

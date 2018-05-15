package bkdn.cntt.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.MapUtils;
import org.zkoss.util.resource.Labels;

import com.querydsl.jpa.impl.JPAQuery;

import bkdn.cntt.model.BaiDang;
import bkdn.cntt.model.NhomMau;
import bkdn.cntt.model.QBaiDang;
import bkdn.cntt.model.ThanhPho;

public class BaiDangService extends BasicService<BaiDang>{
	
	public NhomMau selectedNhomMau;
	private List<ThanhPho> listThanhPho = new ArrayList<ThanhPho>();
	
	public NhomMau getSelectedNhomMau() {
		System.out.println(selectedNhomMau.getTenNhom());
		
		return selectedNhomMau;
	}

	public void setSelectedNhomMau(NhomMau selectedNhomMau) {
		this.selectedNhomMau = selectedNhomMau;
	}

	public JPAQuery<BaiDang> getTargetQuery() {
		String paramTuKhoa = MapUtils.getString(argDeco(),Labels.getLabel("param.tukhoa"),"").trim();
		String publishStatus = MapUtils.getString(argDeco(),Labels.getLabel("param.publishstatus"),"");
		
		JPAQuery<BaiDang> q = find(BaiDang.class)
				.where(QBaiDang.baiDang.trangThai.ne(getCore().TT_DA_XOA));
		q.orderBy(QBaiDang.baiDang.ngayTao.desc());
		
		if(!publishStatus.isEmpty()) {
			boolean status = Boolean.valueOf(publishStatus);
			q.where(QBaiDang.baiDang.publishStatus.eq(status));
		}
		
		if (!paramTuKhoa.isEmpty()) {
			String tukhoa = "%" + paramTuKhoa + "%";
			q.where(QBaiDang.baiDang.noiDung.like(tukhoa));
		}
		return q;
	}
	
	public JPAQuery<BaiDang> getBaiDangChuaDuyet() {
		JPAQuery<BaiDang> q = find(BaiDang.class)
				.where(QBaiDang.baiDang.trangThai.ne(getCore().TT_DA_XOA))
				.where(QBaiDang.baiDang.publishStatus.eq(false));
		q.orderBy(QBaiDang.baiDang.ngayTao.desc());
		return q;
	}
	
	public List<NhomMau> getListNhomMau(){
		return getCore().getNhomMauService().getTenNhomMau().fetch();
	}
	
	public List<ThanhPho> getListThanhPho(){
		listThanhPho = getCore().getThanhPhoService().getTargetQuery().fetch();
		return listThanhPho;
	}
}

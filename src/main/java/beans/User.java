package beans;

import java.util.Date;

public class User {
	private int id;
	private String ho_ten;
	private Date ngay_sinh;
	private String gioi_tinh;
	private String cmnd;
	private String email;
	private String sdt;
	private String ten_dang_nhap;
	private String mat_khau;
	private boolean kich_hoat;
	private int id_quyen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public Date getNgay_sinh() {
		return ngay_sinh;
	}
	public void setNgay_sinh(Date ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	public String getGioi_tinh() {
		return gioi_tinh;
	}
	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getTen_dang_nhap() {
		return ten_dang_nhap;
	}
	public void setTen_dang_nhap(String ten_dang_nhap) {
		this.ten_dang_nhap = ten_dang_nhap;
	}
	public String getMat_khau() {
		return mat_khau;
	}
	public void setMat_khau(String mat_khau) {
		this.mat_khau = mat_khau;
	}
	public boolean isKich_hoat() {
		return kich_hoat;
	}
	public void setKich_hoat(boolean kich_hoat) {
		this.kich_hoat = kich_hoat;
	}
	public int getId_quyen() {
		return id_quyen;
	}
	public void setId_quyen(int id_quyen) {
		this.id_quyen = id_quyen;
	}	
}

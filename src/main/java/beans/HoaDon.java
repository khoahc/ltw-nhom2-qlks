package beans;

import java.util.Date;

public class HoaDon {
	private int id_HD;
	private Date ngay_tao;
	private int id_user;
	public int getId_HD() {
		return id_HD;
	}
	public void setId_HD(int id_HD) {
		this.id_HD = id_HD;
	}
	public Date getNgay_tao() {
		return ngay_tao;
	}
	public void setNgay_tao(Date ngay_tao) {
		this.ngay_tao = ngay_tao;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
}

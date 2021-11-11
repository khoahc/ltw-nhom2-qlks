package beans;

import java.util.Date;

public class Booking {
	private int id_booking;
	private int so_nguoi;
	private boolean co_nguoi_nuoc_ngoai;
	private Date check_in;
	private Date check_out;
	private Float don_gia;
	private boolean dat_online;
	private int id_HD;
	private int id_phong;
	public int getId_booking() {
		return id_booking;
	}
	public void setId_booking(int id_booking) {
		this.id_booking = id_booking;
	}
	public int getSo_nguoi() {
		return so_nguoi;
	}
	public void setSo_nguoi(int so_nguoi) {
		this.so_nguoi = so_nguoi;
	}
	
	public Date getCheck_in() {
		return check_in;
	}
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public Float getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(Float don_gia) {
		this.don_gia = don_gia;
	}

	public int getId_HD() {
		return id_HD;
	}
	public void setId_HD(int id_HD) {
		this.id_HD = id_HD;
	}
	public int getId_phong() {
		return id_phong;
	}
	public void setId_phong(int id_phong) {
		this.id_phong = id_phong;
	}
	public boolean isCo_nguoi_nuoc_ngoai() {
		return co_nguoi_nuoc_ngoai;
	}
	public void setCo_nguoi_nuoc_ngoai(boolean co_nguoi_nuoc_ngoai) {
		this.co_nguoi_nuoc_ngoai = co_nguoi_nuoc_ngoai;
	}
	public boolean isDat_online() {
		return dat_online;
	}
	public void setDat_online(boolean dat_online) {
		this.dat_online = dat_online;
	}

}

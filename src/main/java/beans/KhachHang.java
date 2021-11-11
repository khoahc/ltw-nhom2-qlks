package beans;

public class KhachHang {
	private int id_khach;
	private String ho_ten;
	private String cmnd;
	private String dia_chi;
	private int id_booking;
	public int getId_khach() {
		return id_khach;
	}
	public void setId_khach(int id_khach) {
		this.id_khach = id_khach;
	}
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public int getId_booking() {
		return id_booking;
	}
	public void setId_booking(int id_booking) {
		this.id_booking = id_booking;
	}
}

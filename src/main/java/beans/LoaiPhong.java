package beans;

public class LoaiPhong {
	private int id_loai_phong;
	private String ten_loai_phong;
	private String hinh_anh;
	private float don_gia;
	public int getId_loai_phong() {
		return id_loai_phong;
	}
	public void setId_loai_phong(int id_loai_phong) {
		this.id_loai_phong = id_loai_phong;
	}
	public String getTen_loai_phong() {
		return ten_loai_phong;
	}
	public void setTen_loai_phong(String ten_loai_phong) {
		this.ten_loai_phong = ten_loai_phong;
	}
	public String getHinh_anh() {
		return hinh_anh;
	}
	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}
	public float getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(float don_gia) {
		this.don_gia = don_gia;
	}
	public int getSo_nguoi() {
		return so_nguoi;
	}
	public void setSo_nguoi(int so_nguoi) {
		this.so_nguoi = so_nguoi;
	}
	public String getGhi_chu() {
		return ghi_chu;
	}
	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}
	private int so_nguoi;
	private String ghi_chu;
}

package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.*;

public class DBUtils {
	public static ArrayList<LoaiPhong> getAllLoaiPhong(Connection conn) throws SQLException {
		String sql = "SELECT * FROM loai_phong";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		
		ArrayList<LoaiPhong> lps = new ArrayList<LoaiPhong>();
		while (rs.next()) {
			LoaiPhong lp = new LoaiPhong();
			lp.setId_loai_phong(rs.getInt("id_loai_phong"));
			lp.setTen_loai_phong(rs.getString("ten_loai_phong"));
			lp.setHinh_anh(rs.getString("hinh_anh"));
			lp.setDon_gia(rs.getFloat("so_nguoi"));
			lp.setSo_nguoi(rs.getInt("so_nguoi"));
			lp.setGhi_chu("ghi_chu");
			
			lps.add(lp);
		}
		
		return lps;
	}
	
	public static LoaiPhong getLoaiPhong(Connection conn, int id) throws SQLException {
		String sql = "SELECT * FROM loai_phong lp WHERE lp.id_loai_phong = ?";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		
		LoaiPhong lp = null;
		if (rs.next()) {
			lp = new LoaiPhong();
			lp.setId_loai_phong(id);
			lp.setTen_loai_phong(rs.getString("ten_loai_phong"));
			lp.setHinh_anh(rs.getString("hinh_anh"));
			lp.setDon_gia(rs.getFloat("don_gia"));
			lp.setSo_nguoi(rs.getInt("so_nguoi"));
			lp.setGhi_chu("ghi_chu");
		}
		
		return lp;
	}
	
	public static boolean insertLoaiPhong(Connection conn, LoaiPhong lp) throws SQLException {
		String sql = "INSERT INTO "
				+ "loai_phong(ten_loai_phong, hinh_anh, don_gia, so_nguoi, ghi_chu) "
				+ "VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, lp.getTen_loai_phong());
		pstm.setString(2, lp.getHinh_anh());
		pstm.setDouble(3, lp.getDon_gia());
		pstm.setInt(4, lp.getSo_nguoi());
		pstm.setString(5, lp.getGhi_chu());
		
		if (pstm.executeUpdate() == 1) {
			return true;
		}
		
		return false;
	}
}

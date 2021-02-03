package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;
import vo.UserVO;

public class UserDAO {
	public UserVO login(String id, String pw) {
		String sql =" select * from users where id=? and pw=?";
		UserVO vo = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 
			ps.setString(1, id);
			ps.setString(2, pw);
			//실행
			
			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setRole(rs.getString("role"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}

		return vo;

	}

	public void addUser(UserVO vo) {
		String sql = "insert into users (id,pw,name) values (?,?,?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			//실행
			row = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}

	}

	public UserVO idCheck(String id) {
		String sql =" select * from users where id=?";

		UserVO vo = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 
			ps.setString(1, id);
			//실행
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setRole(rs.getString("role"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return vo;
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class UserDAO {
	public UserVO login(String id,String pw) {
		String sql = " delete from dept where deptno = ? "; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row = 0;                    
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			
			//ps 구문에 파라미터세팅
			ps.setInt(1, deptno);
			
			row = ps.executeUpdate();  // insert , update,delete
			//결과값핸들링 
			
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return row;
	}
	
	public void addUser(UserVO vo) {
		
	}
	
	
	public UserVO idCheck(String id) {
		
	}

}

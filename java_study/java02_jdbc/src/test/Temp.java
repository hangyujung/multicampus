package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Temp {
	
	public void sqlProcess() {
		
		String sql = ""; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row;                    
		
		try {
		
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			
			//ps 구문에 파라미터세팅
			
			
			rs = ps.executeQuery();    //select
			row = ps.executeUpdate();  // insert , update,delete
			
			//결과값핸들링 
			
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		
		
	}

}

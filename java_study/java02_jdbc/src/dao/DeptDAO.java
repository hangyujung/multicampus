package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DeptVO;

public class DeptDAO {

	public int insertDept(DeptVO vo) {
		String sql = " INSERT INTO DEPT(deptno,dname,loc) VALUES (  ?,  ?,   ?)"; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row = 0;                    
		
		try {
		
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			
			//ps 구문에 파라미터세팅
			ps.setInt(1, vo.getDeptno());
			ps.setString(2, vo.getDname());
			ps.setString(3, vo.getLoc());
			
			row = ps.executeUpdate();  // insert , update,delete
			
			//결과값핸들링 
			
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return row;
	}
	
	public DeptVO getDept(int deptno) {
		DeptVO vo = null;
		String sql = "select * from dept where deptno = ? "; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row;                    
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			//ps 구문에 파라미터세팅
			ps.setInt(1, deptno);
			
			rs = ps.executeQuery();    //select
			//결과값핸들링 
			while(rs.next()) {
				vo = new DeptVO();
				vo.setDeptno(rs.getInt("DEPTNO"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
			}
			
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return vo;
	}
	public List<DeptVO> getDeptAll() {
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		String sql = "select * from dept "; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row;                    
		
		try {
		
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			//ps 구문에 파라미터세팅
			
			rs = ps.executeQuery();    //select
			//결과값핸들링 
			while(rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDeptno(rs.getInt("DEPTNO"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				
				list.add(vo);
			}
			
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return list;
	}
	
	public int deleteDept(int deptno) {
	
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
	
	public int updateDept(DeptVO vo) {
		String sql = "update dept set  dname = ? , loc=?   where deptno = ? "; //select , insert , update,delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;        
		int row = 0;                    
		
		try {
		
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql 
			
			//ps 구문에 파라미터세팅
			ps.setString(1, vo.getDname());
			ps.setString(2, vo.getLoc());
			ps.setInt(3, vo.getDeptno());
			
			row = ps.executeUpdate();  // insert , update,delete
		}catch (Exception e) {
          e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, ps, con);
		}
		return row;
	}
}







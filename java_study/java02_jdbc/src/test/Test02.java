package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02 {
	public static void main(String[] args) {

		String sql = "select * from emp";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			//		3. 생성된Connection으로부터 Statement생성
			st = con.createStatement();
			//		4. 생성된 Statement를 이용해서 sql수행
			//		(execute, executeUpdate, executeQuery)
			rs = st.executeQuery(sql);
			//		5. 결과 처리(ResultSet, int)
			System.out.println(" **** select * from emp   결과  목록  출력   *******  ");
			while(rs.next()) {
				System.out.print(rs.getInt("EMPNO")+"\t");
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getString("JOB")+"\t");
				System.out.print(rs.getDate("HIREDATE")+"\t");
				System.out.print(rs.getInt("SAL")+"\t");
				System.out.print(rs.getInt("DEPTNO")+"\n");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//		7. 자원정리(connection, statement, resultset)
			JDBCUtil.close(rs, st, con);
		}
		
		System.out.println(" ******   JDBC END    ******* ");

	}
}

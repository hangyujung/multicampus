package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {
	public static void main(String[] args) {
//		jdbc 프로그래밍 순서 
//		0. 연결할 driver클래스를 classpath아래==>maven 설정으로 대체

		
		
		
		//oracle
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user= "scott";
		String pw="TIGER";

		String sql = " select * from emp join dept on emp.deptno = dept.deptno";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//		1. Driver클래스를 로딩
			Class.forName(driver);
			  
			//		2. 로딩된 Driver클래스를 이용해서 Connection요청(url, user, pwd)
			con = DriverManager.getConnection(url, user, pw);

			
			//		3. 생성된Connection으로부터 Statement생성
			st = con.createStatement();
			
			
			//		4. 생성된 Statement를 이용해서 sql수행
			//		(execute, executeUpdate, executeQuery)
			rs = st.executeQuery(sql);
			
			
			//		5. 결과 처리(ResultSet, int)
			System.out.println(" **** select * from emp   결과  목록  출력   *******  ");
			while(rs.next()) {
				System.out.print(rs.getString("ENAME")+"\t");
				System.out.print(rs.getString("DNAME")+"\n");
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 확인 필요 ");
		}finally {
			//		7. 자원정리(connection, statement, resultset)
			
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println(" ******   JDBC END    ******* ");

	}
}

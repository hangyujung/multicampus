package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil { // DataSource

	public static Connection getConnection() {
		Connection con = null;

		// oracle
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pw = "TIGER";

		try {

			// 1. Driver클래스를 로딩
			Class.forName(driver);
			// 2. 로딩된 Driver클래스를 이용해서 Connection요청(url, user, pwd)
			con = DriverManager.getConnection(url, user, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
	
	public static void close(ResultSet rs,Statement st, Connection con) {

		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(con != null) con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
}

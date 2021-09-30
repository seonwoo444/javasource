package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Connect {

	public static void main(String[] args) {
		//드라이버 로드(제일 처음 연결부터 시키기)
		java.sql.Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");//대소문자 구별 하기
			
			//연결 시도
			//localhost : 본인 컴퓨터
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			if (con!=null) {
				System.out.println("연결되었습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}

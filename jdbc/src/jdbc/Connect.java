package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Connect {

	public static void main(String[] args) {
		//����̹� �ε�(���� ó�� ������� ��Ű��)
		java.sql.Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");//��ҹ��� ���� �ϱ�
			
			//���� �õ�
			//localhost : ���� ��ǻ��
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			if (con!=null) {
				System.out.println("����Ǿ����ϴ�.");
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

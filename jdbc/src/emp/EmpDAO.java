package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JDBC
// ~DAO : database �� ���õ� �۾� Ŭ����
// Ŀ�ؼ�, ��ȸ(select), ����, ����, ����

public class EmpDAO {
	//����̹� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return con;
	}
	
	public List<EmpDTO> select() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			con = getConnection();
			String sql = "select * from emp_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			
				list.add(dto);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	// Ư�� ��� ��ȸ
	public EmpDTO getRow(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		EmpDTO dto = null;
		
		try {
			con = getConnection();
			//String sql = "select * from emp where empno="+empno;
			
			
			String sql = "select * from emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			
			//����ǥ�� ���� ó�� 
			
			pstmt.setInt(1, empno);		
			
			
			rs = pstmt.executeQuery();
			if(rs.next()) { // �ϳ��� �࿡�� �ʵ庰�� ��������+EmpDTO ���
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	
	//�޿� �������� ��ȸ
	public List<EmpDTO> orderBySal() {
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			//Ŀ�ؼ� ����
			con = getConnection();
			//Ŀ�ؼ��� ���� SQL �� ������
			String sql = "select ename,sal from emp_temp order by sal";
			pstmt=con.prepareStatement(sql);
			//SQL ����
			rs=pstmt.executeQuery();
			//���� ����� ����
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString(1));
				dto.setSal(rs.getInt(2));
				list.add(dto);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
//	Ư�� ����� �޿� ����
	public boolean updateSal(int empno, int sal) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		
		try {
			con = getConnection();
			
			String sql = "update emp_temp set sal = ? where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);// 1�� ����ǥ�� �Ծ�ִ´�
			pstmt.setInt(2, empno);// 2�� ����ǥ...
			
			int result = pstmt.executeUpdate();
			if (result > 0) {//update ����
				updateFlag = true;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return updateFlag;// true�� ���� false�� ������Ʈ ����
		
	}
	
}




























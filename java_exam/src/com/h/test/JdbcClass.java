package com.h.test;

import java.sql.*;

public class JdbcClass {

	public static void main(String[] args) {
		
		Connection con = null; //DB�� ���� ó�� Ŭ����
		ResultSet rs = null; //DB�� ��ȸ ����� ���� ������, ó���ϴ� Ŭ����
		PreparedStatement psmt = null; //sql���� ó���ϴ� Ŭ����
		
		try {
			//����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			//����Ŭ�� ����
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("���� ����");
			
			String query = "SELECT * FROM DEPT";
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int depNO = rs.getInt("DEPTNO");
				String dname = rs.getString("DNAME");
				String loc = rs.getNString("LOC");
				
				System.out.println("DEPTNO : " + depNO + " DNAME : " + dname +
						" loc : " + loc);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

/* Oracle JDBC ����
   - oracle library�� ������Ʈ�� ���� ���Ѿ� ���� �Ѵ�.
   - ������Ʈ�� ��� ��Ŭ�� -> Properties�� ���� -> java Build Path ���� -> Module Path�� ���� 
     -> add external jar�� ���� 
   - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib�� ���� ojdbc6_g.jar�� Ŭ���Ͽ� 
       �Ӽ��� ���� ��ü ��θ� �����ϰ� jar������ �ε��Ų�� �� ���� apply�� ������ apply and close�� Ŭ���Ͽ� �׽�Ʈ�� �غ���.
      "���� ����"�̶�� ������ ��µǰ� ���÷� ����ϴ� scott������ DEPT���̺� �÷��� ��ȸ�Ǹ� �������� ���ӵȰ��̴�.
*/

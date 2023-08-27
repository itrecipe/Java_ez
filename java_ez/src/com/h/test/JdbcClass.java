package com.h.test;

import java.sql.*;

public class JdbcClass {

	public static void main(String[] args) {
		
		Connection con = null; //DB?? ?���? 처리 ?��?��?��
		ResultSet rs = null; //DB?�� 조회 결과�? 갖고 ?��?���?, 처리?��?�� ?��?��?��
		PreparedStatement psmt = null; //sql문을 처리?��?�� ?��?��?��
		
		try {
			//?��?��?�� ?��?��?���? 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			//?��?��?��?�� ?���?
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("?��?�� ?���?");
			
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

/* Oracle JDBC ?��?���?
   - oracle library�? ?��로젝?��?�� ?��?�� ?��켜야 ?��?�� ?��?��.
   - ?��로젝?��?�� ??�? ?��?���? -> Properties�? ?��?�� -> java Build Path ?��?�� -> Module Path�? ?��?�� 
     -> add external jar?�� ?��?�� 
   - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib?�� ?��?���?�? ojdbc6_g.jar�? ?���??��?�� 
       ?��?��?�� ?��?���??�� ?���? 경로�? 복사?���? jar?��?��?�� 로드?��?��?�� �? ?��?�� apply�? ?��르고 apply and close�? ?���??��?�� ?��?��?���? ?��본다.
      "?��?�� ?���?"?��?��?�� 문구�? 출력?���? ?��?���? ?��?��?��?�� scott계정?�� DEPT?��?���? 컬럼?�� 조회?���? ?��?��?���? ?��?��?��것이?��.
*/

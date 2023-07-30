package com.kook.jdbcProject;

import java.sql.*;

public class JdbcClass {

	public static void main(String[] args) {
		
		Connection con = null; //DB와 연결 처리 클래스
		ResultSet rs = null; //DB의 조회 결과를 갖고 있으며, 처리하는 클래스
		PreparedStatement psmt = null; //sql문을 처리하는 클래스
		
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			//오라클에 연결
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("정상 연결");
			
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

/* Oracle JDBC 사용법
   - oracle library를 프로젝트에 포함 시켜야 동작 한다.
   - 프로젝트에 대고 우클릭 -> Properties를 선택 -> java Build Path 선택 -> Module Path를 선택 
     -> add external jar을 선택 
   - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib에 들어가면 ojdbc6_g.jar를 클릭하여 
       속성에 들어가서 전체 경로를 복사하고 jar파일을 로드시킨다 그 다음 apply를 누르고 apply and close를 클릭하여 테스트를 해본다.
      "정상 연결"이라는 문구가 출력되고 예시로 사용하는 scott계정의 DEPT테이블 컬럼이 조회되면 정상으로 접속된것이다.
*/

package com.h.test;

import java.sql.*;

public class JdbcClass {

	public static void main(String[] args) {
		
		Connection con = null; //DB?? ?°κ²? μ²λ¦¬ ?΄??€
		ResultSet rs = null; //DB? μ‘°ν κ²°κ³Όλ₯? κ°κ³  ??Όλ©?, μ²λ¦¬?? ?΄??€
		PreparedStatement psmt = null; //sqlλ¬Έμ μ²λ¦¬?? ?΄??€
		
		try {
			//?€?Ό?΄ ??Ό?΄λ²? λ‘λ©
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			//?€?Ό?΄? ?°κ²?
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("? ? ?°κ²?");
			
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

/* Oracle JDBC ?¬?©λ²?
   - oracle libraryλ₯? ?λ‘μ ?Έ? ?¬?¨ ?μΌμΌ ?? ??€.
   - ?λ‘μ ?Έ? ??κ³? ?°?΄λ¦? -> Propertiesλ₯? ? ? -> java Build Path ? ? -> Module Pathλ₯? ? ? 
     -> add external jar? ? ? 
   - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib? ?€?΄κ°?λ©? ojdbc6_g.jarλ₯? ?΄λ¦???¬ 
       ??±? ?€?΄κ°?? ? μ²? κ²½λ‘λ₯? λ³΅μ¬?κ³? jar??Ό? λ‘λ??¨?€ κ·? ?€? applyλ₯? ?λ₯΄κ³  apply and closeλ₯? ?΄λ¦???¬ ??€?Έλ₯? ?΄λ³Έλ€.
      "? ? ?°κ²?"?΄?Ό? λ¬Έκ΅¬κ°? μΆλ ₯?κ³? ??λ‘? ?¬?©?? scottκ³μ ? DEPT??΄λΈ? μ»¬λΌ?΄ μ‘°ν?λ©? ? ??Όλ‘? ? ??κ²μ΄?€.
*/

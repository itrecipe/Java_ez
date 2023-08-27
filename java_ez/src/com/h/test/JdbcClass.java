package com.h.test;

import java.sql.*;

public class JdbcClass {

	public static void main(String[] args) {
		
		Connection con = null; //DB?? ?—°ê²? ì²˜ë¦¬ ?´?ž˜?Š¤
		ResultSet rs = null; //DB?˜ ì¡°íšŒ ê²°ê³¼ë¥? ê°–ê³  ?žˆ?œ¼ë©?, ì²˜ë¦¬?•˜?Š” ?´?ž˜?Š¤
		PreparedStatement psmt = null; //sqlë¬¸ì„ ì²˜ë¦¬?•˜?Š” ?´?ž˜?Š¤
		
		try {
			//?˜¤?¼?´ ?“œ?¼?´ë²? ë¡œë”©
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "scott";
			String pw = "tiger";
			//?˜¤?¼?´?— ?—°ê²?
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("? •?ƒ ?—°ê²?");
			
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

/* Oracle JDBC ?‚¬?š©ë²?
   - oracle libraryë¥? ?”„ë¡œì ?Š¸?— ?¬?•¨ ?‹œì¼œì•¼ ?™?ž‘ ?•œ?‹¤.
   - ?”„ë¡œì ?Š¸?— ??ê³? ?š°?´ë¦? -> Propertiesë¥? ?„ ?ƒ -> java Build Path ?„ ?ƒ -> Module Pathë¥? ?„ ?ƒ 
     -> add external jar?„ ?„ ?ƒ 
   - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib?— ?“¤?–´ê°?ë©? ojdbc6_g.jarë¥? ?´ë¦??•˜?—¬ 
       ?†?„±?— ?“¤?–´ê°??„œ ? „ì²? ê²½ë¡œë¥? ë³µì‚¬?•˜ê³? jar?ŒŒ?¼?„ ë¡œë“œ?‹œ?‚¨?‹¤ ê·? ?‹¤?Œ applyë¥? ?ˆ„ë¥´ê³  apply and closeë¥? ?´ë¦??•˜?—¬ ?…Œ?Š¤?Š¸ë¥? ?•´ë³¸ë‹¤.
      "? •?ƒ ?—°ê²?"?´?¼?Š” ë¬¸êµ¬ê°? ì¶œë ¥?˜ê³? ?˜ˆ?‹œë¡? ?‚¬?š©?•˜?Š” scottê³„ì •?˜ DEPT?…Œ?´ë¸? ì»¬ëŸ¼?´ ì¡°íšŒ?˜ë©? ? •?ƒ?œ¼ë¡? ? ‘?†?œê²ƒì´?‹¤.
*/

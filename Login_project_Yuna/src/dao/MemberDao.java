package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.MemberVo;

public class MemberDao {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "MYSTUDY";
	private String upw = "mystudypw";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	

	public int insert(MemberVo member) throws ClassNotFoundException, SQLException {
		
		String id = member.getId();
		String name = member.getName();
		String password = member.getPassword();
		String email = member.getEmail();
		
		String sql = "INSERT INTO MEMBER ("
				+ "    ID,"
				+ "    NAME,"
				+ "    PASSWORD,"
				+ "    EMAIL "
				+ ") VALUES (?,?,?,?)"; 
				
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,upw);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, id);
		st.setString(2, name);
		st.setString(3, password);
		st.setString(4, email);
		
		int result = st.executeUpdate();
		
		System.out.println("회원가입이 완료되었습니다. 환영합니다!");
		
		System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ '" + name + "' 회원 정보 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
		System.out.println("id = " + id);
		System.out.println("password = " + password);
		System.out.println("email = " + email);
		
		st.close();
		con.close();
		
		return result;
	}

	public MemberVo loginData(String id, String password) throws ClassNotFoundException, SQLException {
		
		MemberVo member = null;
		
		String sql = "" 
				+ "SELECT ID, NAME, PASSWORD, EMAIL "
				+ "FROM MEMBER "
				+ "WHERE ID IN (?,?) ";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,uid,upw);
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			member = new MemberVo();
			member.setId(rs.getString("ID"));
			member.setName(rs.getString("NAME"));
			member.setPassword(rs.getString("PASSWORD"));
			member.setEmail(rs.getString("EMAIL"));
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return member;
	}
	
	
	
	
	
	
}

package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO {
	
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "system";
	private String password = "system";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// DB연결 메서드
	public void connDB()
	{
		try 
		{
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	// DB연결 종료 메서드
	public void disconnectRS()
	{
		if(rs != null)
		{
			try
			{
				rs.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		if(pstmt != null)
		{
			try
			{
				pstmt.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		if(conn != null)
		{
			try
			{
				conn.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}// 종료
	
	// 전체 목록 조회
	public ArrayList<Person> getListAll()
	{
		ArrayList<Person> list = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				String id = rs.getString("userId");
				String pw = rs.getString("userPw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				Person person = new Person();
				person.setUserId(id);
				person.setUserPw(pw);
				person.setName(name);
				person.setAge(age);
				
				list.add(person);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		return list;
	}	// getListAll()
}	// class 닫기

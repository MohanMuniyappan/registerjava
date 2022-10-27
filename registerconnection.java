package registerjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerconnection {
	public static int Register1(register register) throws ClassNotFoundException {
		String sql = "insert into" + " employee(UserName, password, EMail,phoneNumber) values (?,?,?,?)";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","mohanmuniyappan2930");
			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setString(1,register.getUserName());
			pstmt.setString(2,register.getPassword());
			pstmt.setString(3,register.getEMail());
			pstmt.setString(4,register.getPhoneNumber());
			
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
			boolean execute = true;
			if(execute) {
				System.out.println("Record inserted Sucessfully");
			}
			
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

	

	

}

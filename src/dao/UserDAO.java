package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import bean.User;

public class UserDAO extends DAO {

	public boolean insert(User user) throws Exception {
	    Connection con = getConnection();

	    PreparedStatement st = con.prepareStatement(
	    	    "INSERT INTO USER VALUES (NULL, ?,?,?,?,?)");

	    st.setInt(1, user.getId());
	    st.setString(2, user.getName());
	    st.setString(3, user.getPostalcode());
	    st.setString(4, user.getEmail());
	    st.setString(5, user.getPassword());
	    st.setDate(6, (Date) user.getBirthdate());
	    int line = st.executeUpdate();

	    st.close();
	    con.close();

		if(line > 0){
			return true;
		}else{
			return false;
		}
	}
}
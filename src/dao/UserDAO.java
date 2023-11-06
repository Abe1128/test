package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import bean.User;

public class UserDAO extends DAO {


//	ユーザを登録する関数：戻り値はboolean型
	public boolean insert(User user) throws Exception {
	    Connection con = getConnection();

	    PreparedStatement st = con.prepareStatement(
	    	    "INSERT INTO USER VALUES (NULL, ?,?,?,?,?)");

	    st.setString(1, user.getName());
	    st.setString(2, user.getPostalcode());
	    st.setString(3, user.getEmail());
	    st.setString(4, user.getPassword());
	    st.setDate(5, (Date) user.getBirthdate());
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
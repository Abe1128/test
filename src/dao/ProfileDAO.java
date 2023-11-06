package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Profile;

public class ProfileDAO extends DAO {

	public boolean insert(Profile profile) throws Exception {
	    Connection con = getConnection();

	    PreparedStatement st = con.prepareStatement(
	    	    "INSERT INTO PROFILE VALUES (NULL,?,?,?,?,?)");

	    st.setInt(1, profile.getId());
	    st.setString(2, profile.getNickname());
	    st.setString(3, profile.getGeneration());
	    st.setString(4, profile.getGender());
	    st.setString(5, profile.getSelfintroduction());
	    st.setString(6, profile.getHobby());
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
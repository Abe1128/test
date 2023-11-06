package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Profile;

public class ProfileDAO extends DAO {


//	プロフィールを登録する関数：戻り値はboolean型
	public boolean insert(Profile profile) throws Exception {
	    Connection con = getConnection();

	    PreparedStatement st = con.prepareStatement(
	    	    "INSERT INTO PROFILE VALUES (NULL,?,?,?,?,?)");

	    st.setString(1, profile.getNickname());
	    st.setString(2, profile.getGeneration());
	    st.setString(3, profile.getGender());
	    st.setString(4, profile.getSelfintroduction());
	    st.setString(5, profile.getHobby());
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
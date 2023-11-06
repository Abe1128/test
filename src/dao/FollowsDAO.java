package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FollowsDAO extends DAO {

//  フォローする関数：戻り値はboolean型
//	follow_idはフォローをした人、follower_idはフォローされた人
	public boolean follow(int follow_id, int follower_id) throws Exception {
	    Connection con = getConnection();

	    PreparedStatement st = con.prepareStatement(
	    	    "INSERT INTO USER VALUES (NULL, ?,?)");

	    st.setInt(1, follow_id);
	    st.setInt(2, follower_id);
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
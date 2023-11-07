package bean;

public class Follows implements java.io.Serializable{

//	ユーザクラスの情報は非公開、
//	プロフィールクラスを公開情報とする。

	private int id;
	private String followerid;
	private String followeeid;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFollowerid() {
		return followerid;
	}
	public void setFollowerid(String followerid) {
		this.followerid = followerid;
	}
	public String getFolloweeid() {
		return followeeid;
	}
	public void setFolloweeid(String followeeid) {
		this.followeeid = followeeid;
	}

}
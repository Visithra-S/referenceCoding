
public class User {

	private String UserName;
	private String pwd;
	private String emailId;

	public User(String userName, String pwd, String emailId) {
		super();
		UserName = userName;
		this.pwd = pwd;
		this.emailId = emailId;
	}

	public User(String userName, String pwd) {
		super();
		UserName = userName;
		this.pwd = pwd;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	  @Override public String toString() { return "\n User [UserName=" + UserName +
	 ", pwd=" + pwd + ", emailId=" + emailId + "]"; }
	 

}

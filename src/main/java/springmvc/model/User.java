package springmvc.model;

public class User {
	public String useremail;
	public String username;
	public String password;
	@Override
	public String toString() {
		return "User [useremail=" + useremail + ", username=" + username + ", password=" + password + "]";
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

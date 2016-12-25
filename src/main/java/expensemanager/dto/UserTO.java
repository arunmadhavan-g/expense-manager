package expensemanager.dto;

public class UserTO {

	private User user;
	private String password;
	
	public UserTO() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Credentials getCredentials() {
		return new Credentials(user.getEmail(), password);
	}
	
}

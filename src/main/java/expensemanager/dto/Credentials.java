package expensemanager.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credentials {

	@Id
	private String userId;
	private String password;
	
	public Credentials() {
	}

	public Credentials(String email, String password) {
		userId = email;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAuthenticated(String password) {
		return this.password.equals(password);
	}
	
}

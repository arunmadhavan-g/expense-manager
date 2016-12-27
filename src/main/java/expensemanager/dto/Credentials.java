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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Credentials){
			Credentials that = (Credentials)obj;
			return that.userId.equals(this.userId) &&
					that.password.equals(this.password);
		}
		return false;
	}
	
}

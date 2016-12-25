package expensemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensemanager.persistence.repository.CredentialsReporitory;

@Service
public class CredentialsOperations {

	@Autowired
	private CredentialsReporitory repository;

	public boolean validate(String userId, String password){
		return repository.findOne(userId).isAuthenticated(password);
	}
	
}

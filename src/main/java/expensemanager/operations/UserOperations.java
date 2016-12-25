package expensemanager.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensemanager.dto.User;
import expensemanager.dto.UserTO;
import expensemanager.persistence.repository.CredentialsReporitory;
import expensemanager.persistence.repository.UserRepository;

@Service
public class UserOperations {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CredentialsReporitory credentialsRepository;
	
	public User createUser(UserTO user){
		credentialsRepository.save(user.getCredentials());
		return userRepository.save(user.getUser());
	}
	
	public User login(String email, String password){
		if(credentialsRepository.findOne(email).isAuthenticated(password))
			return userRepository.findByName(email);
		
		throw new RuntimeException("User Not Authenticated.");
	}
	
}

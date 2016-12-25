package expensemanager.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensemanager.dto.Credentials;
import expensemanager.dto.User;
import expensemanager.persistence.repository.CredentialsReporitory;
import expensemanager.persistence.repository.UserRepository;

@Service
public class UserOperations {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CredentialsReporitory credentialsRepository;
	
	public User createUser(User user, String password){
		credentialsRepository.save(new Credentials(user.getEmail(), password));
		return userRepository.save(user);
	}
	
	public User login(String email, String password){
		if(credentialsRepository.findOne(email).isAuthenticated(password))
			return userRepository.findByUserName(email);
		
		throw new RuntimeException("User Not Authenticated.");
	}
	
}

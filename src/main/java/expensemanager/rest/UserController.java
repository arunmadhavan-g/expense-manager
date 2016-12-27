package expensemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import expensemanager.dto.Credentials;
import expensemanager.dto.User;
import expensemanager.dto.UserTO;
import expensemanager.operations.UserOperations;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserOperations userOperations;
	
	@RequestMapping(path="/create",method=RequestMethod.POST)
	public User createUser(@RequestBody(required=true)UserTO user){
		return userOperations.createUser(user);
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public User login(@RequestBody(required=true)Credentials credentials){
		return userOperations.login(credentials);
	}
	
	@RequestMapping("/printall")
	public String printAll(){
		userOperations.printAllUsers();
		return "printed";
	}
	
	
	
}

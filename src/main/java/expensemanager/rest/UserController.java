package expensemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import expensemanager.dto.User;
import expensemanager.dto.UserTO;
import expensemanager.operations.UserOperations;

@RestController
public class UserController {

	@Autowired
	private UserOperations userOperations;
	
	@RequestMapping(path="/user/create",method=RequestMethod.POST)
	public User createUser(@RequestBody(required=true)UserTO user){
		System.out.println(user.getPassword());
		return userOperations.createUser(user);
	}
	
	
	
	
}

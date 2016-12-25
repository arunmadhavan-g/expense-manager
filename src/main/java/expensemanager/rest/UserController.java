package expensemanager.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import expensemanager.operations.UserOperations;

@Controller
public class UserController {

	@Autowired
	UserOperations userOperations;
	
	
	
}

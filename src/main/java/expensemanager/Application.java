package expensemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/**
	 * what do we need?
	 * 
	 * An Application that captures Expense. 
	 * 
	 * So one needs to login and he'll have a profile.
	 * So for each fellow he can have a bunch of Expenses 
	 * 
	 *  The Expense has a id, item, description, amount, date
	 *  
	 *  one can add, modify and delete and view expenses.
	 *  
	 *  
	 *  I need the following objects
	 *  
	 *  User 
	 *  ----
	 *  Name
	 *  email
	 *  List<Expense>
	 *  
	 *  
	 *  
	 *  Expense
	 *  ---------
	 *  Id
	 *  Item
	 *  description
	 *  amount
	 *  date
	 *  User
	 *  
	 *  
	 *  Each of these will have a repository
	 *  
	 *  You'll have a UserOperations and an ExpenseOperations
	 *  
	 *  You'll also have 2 controllers UserController and ExpenseController making calls to the Operations 
	 *  
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}

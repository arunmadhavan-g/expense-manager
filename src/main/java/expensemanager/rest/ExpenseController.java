package expensemanager.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import expensemanager.dto.Expense;
import expensemanager.dto.ExpenseTO;
import expensemanager.operations.ExpenseOperations;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

	@Autowired
	private ExpenseOperations expenseOperations;
	
	@RequestMapping(path="/create", method=RequestMethod.POST)
	public Expense create(@RequestBody(required=true) ExpenseTO expense){
		return expenseOperations.createExpense(expense);
	}
	
	@RequestMapping("/list")
	public List<Expense> list(){
		return expenseOperations.all();
	}
	
	
	@RequestMapping("/{id}")
	public Expense search(@PathVariable(value="id") String id){
		return expenseOperations.getExpense(id);
	}
	
}

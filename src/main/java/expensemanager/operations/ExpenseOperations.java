package expensemanager.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensemanager.dto.Expense;
import expensemanager.dto.ExpenseTO;
import expensemanager.persistence.repository.ExpenseRepository;
import expensemanager.persistence.repository.UserRepository;

@Service
public class ExpenseOperations {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public Expense createExpense(ExpenseTO expenseTO){
		Expense expense = new Expense();
		expense.setItem(expenseTO.getItem());
		expense.setUser(userRepository.findOne(expenseTO.getUserId()));
		expense.setDescription(expenseTO.getDescription());
		expense.setAmount(expenseTO.getAmount());
		expense.setDate(expenseTO.getDate(), "dd-MMM-yyyy hh:mm:ss a");
		return expenseRepository.save(expense);
	}
	
	public Expense getExpense(String id){
		return expenseRepository.findOne(id);
	}

	public List<Expense> all() {
		return (List<Expense>) expenseRepository.findAll();
	}
	
}

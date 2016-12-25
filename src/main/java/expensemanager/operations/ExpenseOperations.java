package expensemanager.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import expensemanager.dto.Expense;
import expensemanager.persistence.repository.ExpenseRepository;

@Service
public class ExpenseOperations {

	@Autowired
	private ExpenseRepository repository;
	
	public Expense createExpense(Expense expense){
		return repository.save(expense);
	}
	
	public Expense getExpense(String id){
		return repository.findOne(id);
	}
	
}

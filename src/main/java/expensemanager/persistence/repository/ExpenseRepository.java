package expensemanager.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import expensemanager.dto.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, String> {
 //Empty Body for now
}

package expensemanager.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import expensemanager.dto.User;

public interface UserRepository extends CrudRepository<User, String> {
	
	public User findByUserName(String name);
}

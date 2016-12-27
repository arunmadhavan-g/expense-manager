package expensemanager.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import expensemanager.dto.Credentials;

public interface CredentialsReporitory extends CrudRepository<Credentials, String> {
	//EMPTY Body
}

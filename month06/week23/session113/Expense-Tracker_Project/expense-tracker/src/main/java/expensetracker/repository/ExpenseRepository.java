package expensetracker.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import expensetracker.model.Expense;
import expensetracker.model.User;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

//	all expense (own)
	List<Expense> findByUser(User user);
	
//	id + user (security)
	Optional<Expense> findByIdAndUser(Long id, User user);
	
//	filter by month
	List<Expense> findByUserAndDateBetween(User user, LocalDate start, LocalDate end);
	
//	category + month
	List<Expense> findByUserAndCategoryIdAndDateBetween (
			User user,
			Long categoryIdLong,
			LocalDate start,
			LocalDate end
	);
}

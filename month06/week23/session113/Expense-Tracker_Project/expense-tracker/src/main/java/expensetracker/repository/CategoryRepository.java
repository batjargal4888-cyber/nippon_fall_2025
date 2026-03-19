package expensetracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import expensetracker.model.User;
import expensetracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
//	own categories
	List<Category> findByUser(User user);
	
//	id + user (security check)
	Optional<Category> findByIdAndUser(Long id, User user);
	
//	duplicate name check
	boolean existsByUserAndName(User user, String name);
}

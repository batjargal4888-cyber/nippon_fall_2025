package session109.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import session109.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
}
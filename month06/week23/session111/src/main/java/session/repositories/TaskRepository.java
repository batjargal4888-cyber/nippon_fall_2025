package session.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import session.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}

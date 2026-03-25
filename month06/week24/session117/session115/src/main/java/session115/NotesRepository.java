package session115;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {

	List<Notes> findByUserUsername(String username);
}

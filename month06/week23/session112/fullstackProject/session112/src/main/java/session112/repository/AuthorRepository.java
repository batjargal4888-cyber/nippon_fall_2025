package session112.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import session112.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
package session112.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import session112.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
package session106;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getBookById(Long id) {
		return bookRepository.findById(id);
	}
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Optional<Book> updateBook(Long id, Book updateBook) {
		return bookRepository.findById(id).map(existing -> {
			existing.setTitle(updateBook.getTitle());
			existing.setAuthor(updateBook.getAuthor());
			existing.setYear(updateBook.getYear());
			return bookRepository.save(existing);
		});
	}
	
	public boolean deleteBook(Long id) {
		if (bookRepository.existsById(id)) {
			bookRepository.deleteById(id);
			return true;
		}
		return false;
	}
}

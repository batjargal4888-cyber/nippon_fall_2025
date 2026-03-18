package session112.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import session112.entity.Author;
import session112.entity.Book;
import session112.repository.AuthorRepository;
import session112.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {

    private final BookRepository repo;
    private final AuthorRepository authorRepository;

    public BookController(BookRepository repo, AuthorRepository authorRepository) {
        this.repo = repo;
        this.authorRepository = authorRepository;
    }

    // GET all books
    @GetMapping
    public List<Book> getAll() {
        return repo.findAll();
    }

    // POST create book
    @PostMapping
    public Book create(@RequestBody Book book) {
    	Long authorId = book.getAuthor().getId();
    	
    	Author author = authorRepository.findById(authorId)
    			.orElseThrow(() -> new RuntimeException("Author not found"));
    	
    	book.setAuthor(author);
    	
        return repo.save(book);
    }

    // DELETE book
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        // author холбоосыг салгана
        book.setAuthor(null);

        repo.delete(book);
    }
}
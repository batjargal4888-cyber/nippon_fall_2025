package session112.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import session112.entity.Author;
import session112.repository.AuthorRepository;

@RestController
@RequestMapping("/api/authors")
@CrossOrigin
public class AuthorController {

    private final AuthorRepository repo;

    public AuthorController(AuthorRepository repo) {
        this.repo = repo;
    }

    // GET all authors
    @GetMapping
    public List<Author> getAll() {
        return repo.findAll();
    }

    // POST create author
    @PostMapping
    public Author create(@RequestBody Author author) {
        return repo.save(author);
    }

    // DELETE author
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
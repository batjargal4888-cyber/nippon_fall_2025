package session115;

import java.security.Principal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
public class NotesController {

	private final NotesRepository notesRepository;
	private final UserRepository userRepository;
	
	public NotesController(NotesRepository notesRepository, UserRepository userRepository) {
		this.notesRepository = notesRepository;
		this.userRepository = userRepository;
	}
	
	@GetMapping
	public List<Notes> getMyNotes(Principal principal) {
		return notesRepository.findByUserUsername(principal.getName());
	}
	
	@PostMapping
	public Notes createNote(@RequestBody Notes newNote, Principal principal) {
		User user = userRepository.findByUsername(principal.getName()).orElseThrow();
		newNote.setUser(user);
		return notesRepository.save(newNote);
	}
}

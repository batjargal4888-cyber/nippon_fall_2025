package exercises;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
	
	private List<Teacher> teachers = new ArrayList<>();
	private int nextId = 1;
	
	@GetMapping
	public List<Teacher> getAll() {
		return teachers;
	}
	
	@PostMapping
	public String addTeacher(@RequestBody Teacher teacher) {
		
		teacher.setId(nextId++);
		teachers.add(teacher);
		
		return "{\"status\":\"added\"}";
	}
	
	@DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable("id") int id) {
        if (id >= 0 && id < teachers.size()) {
            teachers.remove(id);
        }
        return "{\"status\":\"deleted\"}";
    }
}

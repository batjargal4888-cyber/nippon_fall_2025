package exercises;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private List<Student> students = new ArrayList<>();
	
	// Бүх student авах
	@GetMapping
	public List<Student> getStudents() {
		return students;
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		
	    // Энд ID автоматаар өгч байна
		student.setId((long) (students.size() + 1));
		
		students.add(student);
		return student;
	}
	
	// Student устгах
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		students.removeIf(s -> s.getId() != null && s.getId().equals(id));
	}
}

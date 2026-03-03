package test;

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
	private List<Student> students = new ArrayList<Student>();
	
	@GetMapping
	public List<Student> getAll(){
		return students;
	}
	
	@PostMapping
	public String addStudent(@RequestBody Student student) {
		students.add(student);
		return "{\"status\":\"added\"}";
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		if (id >= 0 || id < students.size()) {
			students.remove(id);
		}
		
		return "{\"status\":\"deleted\"}";
	}
}

package session107;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
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

	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
		return studentService.getStudentById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student created = studentService.createStudent(student);
		return ResponseEntity.status(201).body(created);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("id") Long id) {
		boolean deleted = studentService.deleteStudent(id);
		return ResponseEntity.status(201).body(deleted);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id, @RequestBody Student updateStudent) {
		Optional<Student> updatedStudent = studentService.updateStudent(id, updateStudent);
		return ResponseEntity.status(201).body(updatedStudent.get());
	}
}
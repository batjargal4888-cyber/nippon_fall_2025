package session109.controllers;

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

import session109.model.Task;
import session109.services.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Task> getTaskById(@PathVariable("id") Long id) {
		return taskService.getTaskById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Task> createTask(@RequestBody Task task) {
		Task created = taskService.createTask(task);
		return ResponseEntity.status(201).body(created);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteTask(@PathVariable("id") Long id) {
		boolean deleted = taskService.deleteTask(id);
		return ResponseEntity.status(201).body(deleted);
	}
	
//	Update book by ID
	@PostMapping("/{id}")
	public ResponseEntity<Task> updateTask(@PathVariable("id") Long id, @RequestBody Task updateTask) {
		Optional<Task> updatedTask = taskService.updateTask(id, updateTask);
		return ResponseEntity.status(201).body(updatedTask.get());
	}
}
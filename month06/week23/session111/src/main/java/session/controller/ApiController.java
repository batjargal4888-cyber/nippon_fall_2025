package session.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import session.model.Category;
import session.model.Task;
import session.repositories.CategoryRepository;
import session.repositories.TaskRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

	private final TaskRepository taskRepository;
	private final CategoryRepository categoryRepository;
	
	public ApiController(TaskRepository taskRepository, CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
		this.taskRepository = taskRepository;
	}
	
//	Category API
	@GetMapping("/categories")
	public List<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Map<String, String> payload) {
		Category category = new Category();
		category.setName(payload.get("name"));
		return categoryRepository.save(category);
	}
	
	@GetMapping("/tasks")
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}
	
	@PostMapping("/tasks")
	public Task addTask(@RequestBody Map<String, String> payLoad) {
		Task task = new Task();
		task.setDescription(payLoad.get("description"));
		Long catId = Long.parseLong(payLoad.get("categoryId"));
		categoryRepository.findById(catId).ifPresent(task::setCategory);
		return taskRepository.save(task);
	}
}

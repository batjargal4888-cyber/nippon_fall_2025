package session109.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import session109.model.Task;
import session109.repository.TaskRepository;

@Service
public class TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> getAllTasks() {
		return this.taskRepository.findAll();
	}
	
	public Optional<Task> getTaskById(Long Id) {
		return taskRepository.findById(Id);
	}
	
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
	
	public Optional<Task> updateTask(Long id, Task updateTask) {
		return taskRepository.findById(id).map(existing -> {
			existing.setTitle(updateTask.getTitle());
			existing.setDescription(updateTask.getDescription());
			existing.setCompleted(updateTask.getCompleted());
			return taskRepository.save(existing);
		});
	}
	
	public boolean deleteTask(Long id) {
		if (taskRepository.existsById(id)) {
			taskRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
}
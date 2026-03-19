package expensetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import expensetracker.dto.CategoryRequest;
import expensetracker.model.Category;
import expensetracker.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	private final CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
//	get all
	@GetMapping
	public List<Category> getAll() {
		return categoryService.getAll();
	}
	
//	create
	@PostMapping
	public Category create(@RequestBody CategoryRequest request) {
		return categoryService.create(request.getName(), request.getIcon());
	}
	
//	update
	@PutMapping("/{id}")
	public Category update(@PathVariable Long id,
							@RequestBody CategoryRequest request) {
		return categoryService.update(id, request.getName(), request.getIcon());
	}
	
//	delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoryService.delete(id);
	}
}

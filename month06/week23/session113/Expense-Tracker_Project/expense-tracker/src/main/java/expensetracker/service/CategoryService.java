package expensetracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import expensetracker.model.User;
import expensetracker.model.Category;
import expensetracker.repository.CategoryRepository;
import expensetracker.repository.UserRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;
	private final UserRepository userRepository;
	
	public CategoryService(CategoryRepository categoryRepository,
							UserRepository userRepository) {
		this.categoryRepository = categoryRepository;
		this.userRepository = userRepository;
	}
	
//	get all category
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
	
//	+ create category
	public Category create(String name, String icon) {
		
//		guest user (no JWT)
		User user = userRepository.findById(1L)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		if (categoryRepository.existsByUserAndName(user, name)) {
			throw new RuntimeException("Category already exists");
		}
		
		Category category = new Category(user, name, icon);
		
		return categoryRepository.save(category);
	}
	
//	edit
	public Category update(Long id, String name, String icon) {
		
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found"));
		
		category.setName(name);
		category.setIcon(icon);
		
		return categoryRepository.save(category);
	}
	
//	delete
	public void delete(Long id) {
		
		Category category = categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found"));
		
		categoryRepository.delete(category);
	}
}

package expensetracker.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import org.springframework.stereotype.Service;

import expensetracker.model.Category;
import expensetracker.model.Expense;
import expensetracker.model.User;
import expensetracker.repository.CategoryRepository;
import expensetracker.repository.ExpenseRepository;
import expensetracker.repository.UserRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
	private final UserRepository userRepository;
	private final CategoryRepository categoryRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository,
							UserRepository userRepository,
							CategoryRepository categoryRepository) {
		this.expenseRepository = expenseRepository;
		this.userRepository = userRepository;
		this.categoryRepository = categoryRepository;
	}
	
//	get all expense (filter optional)
	public List<Expense> getAll(String month, Long categoryId) {
		
		User user = userRepository.findById(1L)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
//		no filter
		if (month == null && categoryId == null) {
			return expenseRepository.findByUser(user);
		}
		
//		month filter
		if (month != null && categoryId == null) {
			YearMonth ym = YearMonth.parse(month);
			LocalDate start = ym.atDay(1);
			LocalDate end = ym.atEndOfMonth();
			
			return expenseRepository.findByUserAndDateBetween(user, start, end);
		}
		
//		category + month filter
		if (month != null && categoryId != null) {
			YearMonth ym = YearMonth.parse(month);
			LocalDate start = ym.atDay(1);
			LocalDate end = ym.atEndOfMonth();
			
			return expenseRepository.findByUserAndCategoryIdAndDateBetween(
					user, categoryId, start, end
			);
		}
		
//		fall back
		return expenseRepository.findByUser(user);
	}
	
//	+ create
	public Expense create(String title,
							Double amount,
							LocalDate date,
							Long categoryId,
							String notes) {
		
		User user = userRepository.findById(1L)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		Category category = null;
		
		if (categoryId != null) {
			category = categoryRepository.findById(categoryId)
					.orElseThrow(() -> new RuntimeException("Category not found"));
		}
		
		Expense expense = new Expense();
		expense.setUser(user);
		expense.setCategory(category);
		expense.setTitle(title);
		expense.setAmount(java.math.BigDecimal.valueOf(amount));
		expense.setDate(date);
		expense.setNotes(notes);
		
		return expenseRepository.save(expense);
	}
	
//	update
	public Expense update(Long id,
							String title,
							Double amount,
							LocalDate date,
							Long categoryId,
							String notes) {
		
		Expense expense = expenseRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Expense not found"));
		
		Category category = null;
		
		if (categoryId != null) {
			category = categoryRepository.findById(categoryId)
					.orElseThrow(() -> new RuntimeException("Category not found"));
		}
		
		expense.setCategory(category);
		expense.setTitle(title);
		expense.setAmount(java.math.BigDecimal.valueOf(amount));
		expense.setDate(date);
		expense.setNotes(notes);
		
		return expenseRepository.save(expense);
	}
	
//	delete
	public void delete(Long id) {
		
		Expense expense = expenseRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Expense not found"));
		
		expenseRepository.delete(expense);
	}
}

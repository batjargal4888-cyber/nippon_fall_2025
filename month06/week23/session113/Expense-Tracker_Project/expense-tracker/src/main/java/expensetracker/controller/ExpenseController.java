package expensetracker.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import expensetracker.dto.ExpenseRequest;
import expensetracker.model.Expense;
import expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
//	get (filter optional)
	@GetMapping
	private List<Expense> getAll() (
		@RequestParam(required = false) String month,
		@RequestParam(required = false) Long categoryId) {
		
		return expenseService.getAll(month, categoryId);
		
	}
	
//	+ create
	@PostMapping
	public Expense create(@RequestBody ExpenseRequest request) {
		return expenseService.create(
				request.getTitle(),
				request.getAmount(),
				request.getDate(),
				request.getCategoryId(), 
				request.getNotes()
		);
	}
	
//	update
	@PutMapping("/{id}")
	public Expense update(@PathVariable Long id,
							@RequestBody ExpenseRequest request) {
		return expenseService.update(
				id, 
				request.getTitle(), 
				request.getAmount(), 
				request.getDate(), 
				request.getCategoryId(), 
				request.getNotes()
		);
	}
	
//	delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		expenseService.delete(id);
	}
}

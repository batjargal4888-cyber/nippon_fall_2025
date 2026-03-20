package expensetracker.dto;

import java.time.LocalDate;

public class ExpenseRequest {

	private String title;
	private Double amount;
	private LocalDate date;
	private Long categoryId;
	private String notes;
	
//	getters
	
	public String getTitle() {
		return title;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public Long getCategoryId() {
		return categoryId;
	}
	
	public String getNotes() {
		return notes;
	}
}

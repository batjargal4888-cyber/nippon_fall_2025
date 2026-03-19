package expensetracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	which user expense
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
//	which category
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	
//	name
	@Column(nullable = false)
	private String title;
	
//	amount
	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal amount;
	
//	date
	@Column(nullable = false)
	private LocalDate date;
	
//	additional note
	private String notes;
	
//	created date
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
//	constructor
	public Expense() {}
	
	public Expense(User user, Category category, String title, BigDecimal amount, LocalDate date, String notes) {
		this.user = user;
		this.category = category;
		this.title = title;
		this.amount = amount;
		this.date = date;
		this.notes = notes;
	}
	
//	lifecycle
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
	}
	
//	getter & setters
	
	public Long getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}

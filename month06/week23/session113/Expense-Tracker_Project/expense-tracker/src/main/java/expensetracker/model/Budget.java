package expensetracker.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(
		name = "budgets",
		uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "category_id", "month"})
)
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	which user budget
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
//	what category budget
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
//	month
	@Column(nullable = false)
	private LocalDate month;
	
//	limit amount
	@Column(nullable = false, precision = 12,scale = 2)
	private BigDecimal limitAmount;
	
//	constructor
	public Budget() {}
	
	public Budget(User user, Category category, LocalDate month, BigDecimal limitAmount) {
		this.user = user;
		this.category = category;
		this.month = month;
		this.limitAmount = limitAmount;
	}
	
//	getters & setters
	
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
	
	public LocalDate getMonth() {
		return month;
	}
	
	public void setMonth(LocalDate month) {
		this.month = month;
	}
	
	public BigDecimal getLimitAmount() {
		return limitAmount;
	}
	
	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}
}

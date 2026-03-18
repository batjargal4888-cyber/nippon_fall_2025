package expensetracker.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(	name = "categories",
		uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "name"}))
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	relationship
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@Column(nullable = false)
	private String name;
	
	private String icon;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
//	Constructor
	public Category() {};
	
	public Category(User user, String name, String icon) {
		this.user = user;
		this.name = name;
		this.icon = icon;
	}
	
//	Lifecycle
	@PrePersist
	public void prePersis() {
		this.createdAt = LocalDateTime.now();
	}
	
//	Getters & Setters
	
	public Long getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}

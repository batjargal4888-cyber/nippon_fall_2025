package expensetracker.model;

import java.time.LocalDateTime;

import javax.management.relation.Role;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	public enum Role {
		USER, ADMIN
	}
	
//	Constructor
	public User() {}
	
	public User(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}
	
//	Lifecycle
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
		this.role = Role.USER;
	}
	
//	Getters & Setters
	
	public Long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Role getRole() {
		return role;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}

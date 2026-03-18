package session109.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Title is required")
	@Size(min = 3, max = 100, message = "Title must be between 3 to 100 characters")
	private String title;
	
	@Size(max = 500, message = "Description too long")
	private String description;
	
	@Column(name = "is_completed")
	private boolean completed;
	
	@Column(name = "created_date")
	private String createdDate;
	
//	Getters & Setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public boolean getCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
}
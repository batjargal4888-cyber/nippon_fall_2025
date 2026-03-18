package session.model;

import jakarta.persistence.*;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
//	Getters & Setters
	public Long getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
}

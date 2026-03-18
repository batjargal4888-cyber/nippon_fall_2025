package session.model;

import jakarta.persistence.*;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String name;
	
//	Getters & Setters
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

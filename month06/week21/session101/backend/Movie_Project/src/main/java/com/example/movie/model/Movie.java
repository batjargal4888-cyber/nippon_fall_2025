package com.example.movie.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "movies")
public class Movie {

//	ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	Title
	@NotBlank(message = "Title is required")
	@Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
	private String title;
	
//	Director
	@NotBlank(message = "Director is required")
	private String director;
	
//	Release Year
	@NotNull(message = "Release year is required")
	@Min(value = 1888, message = "Release year must be after 1888")
	private Integer releaseYear;
	
//	Rating
	@NotNull(message = "Rating is required")
	@DecimalMin(value = "0.0", message = "Rating must be at least 0")
	@DecimalMax(value = "10.0", message = "Rating cannot exceed 10")
	private double rating;
	
//	Description
	@Size(max = 500, message = "Description is too long")
	private String description;
	
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
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Integer getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

package com.example.movie.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.model.Movie;
import com.example.movie.service.MovieService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin
public class MovieController {

	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
//	GET all movies
	@GetMapping
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
//	POST create movie
	@PostMapping
	public Movie createMovie(@Valid @RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
	
//	PUT update movie
	@PutMapping
	public Movie updateMovie(@PathVariable Long id, @Valid @RequestBody Movie movie) {
		return movieService.updateMovie(id, movie);
	}
	
//	DELETE movie
	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable Long id) {
		movieService.deleteMovie(id);
	}
}

package com.example.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;

@Service
public class MovieService {
	
	private final MovieRepository movieRepository;
	
//	Construction Injection
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
//	Get all movies
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}
	
//	Save movie
	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
//	Update movie
	public Movie updateMovie(Long id, Movie movie) {
		movie.setId(id);
		return movieRepository.save(movie);
	}
	
//	Delete movie
	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);
	}
}

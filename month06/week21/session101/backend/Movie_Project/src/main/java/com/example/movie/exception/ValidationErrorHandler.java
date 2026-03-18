package com.example.movie.exception;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ValidationErrorHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationErrors(MethodArgumentNotValidException ex) {
		
		List<String> errors = new ArrayList<>();
		
		ex.getBindingResult().getFieldErrors().forEach(fieldError ->
				errors.add(fieldError.getDefaultMessage())
		);
		
		Map<String, Object> response = new HashMap<>();
		response.put("errors", errors);
		
		return ResponseEntity.badRequest().body(response);
	}
}

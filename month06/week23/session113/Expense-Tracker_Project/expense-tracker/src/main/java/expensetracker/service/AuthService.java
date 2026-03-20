package expensetracker.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import expensetracker.model.User;
import expensetracker.repository.UserRepository;

@Service
public class AuthService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public AuthService (UserRepository userRepository,
						PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
//	register
	public User register(String email, String password, String name) {
		if (userRepository.existsByEmail(email)) {
			throw new RuntimeException("Email already exists");
		}
		
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(passwordEncoder.encode(password)); // encode
		
		return userRepository.save(user);
	}
	
//	login
	public User login(String email, String password) {
		
		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new RuntimeException("Invalid email"));
		
		if (!passwordEncoder.matches(password, user.getPassword())) {
			throw new RuntimeException("Wrong password");
		}
		
		return user;
	}
}

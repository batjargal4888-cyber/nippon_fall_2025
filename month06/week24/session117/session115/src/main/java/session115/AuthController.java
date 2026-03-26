package session115;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private final UserRepository userRepository;
	private final PasswordEncoder encoder;
	private final JwtUtil jwtUtil;
	
	public AuthController (UserRepository userRepository, PasswordEncoder encoder, JwtUtil jwtUtil) {
		this.userRepository = userRepository;
		this.encoder = encoder;
		this.jwtUtil = jwtUtil;
	}
	
	@PostMapping("/register")
	public Map<String, String> register(@RequestBody AuthRequestDTO requestDTO) {
		User user = new User();
		user.setUsername(requestDTO.getUsername());
		user.setPassword(encoder.encode(requestDTO.getPassword()));
		userRepository.save(user);
		return Map.of("message", "User registered successfully");
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthRequestDTO requestDTO) {
		return userRepository.findByUsername(requestDTO.getUsername())
				.filter(user -> encoder.matches(requestDTO.getPassword(), user.getPassword()))
				.map(user -> ResponseEntity.ok(new AuthResponseDTO(jwtUtil.generateToken(user.getUsername()))))
				.orElse(ResponseEntity.status(401).build());
	}
}

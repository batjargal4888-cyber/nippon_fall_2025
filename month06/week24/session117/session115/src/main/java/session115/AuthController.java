package session115;

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
	public String register(@RequestBody AuthRequestDTO requestDTO) {
		User user = new User();
		user.setUsername(requestDTO.getUsername());
		user.setPassword(encoder.encode(requestDTO.getPassword()));
		userRepository.save(user);
		return "User registerd";
	}
	
	@PostMapping("/login")
	public AuthResponseDTO login(@RequestBody AuthRequestDTO requestDTO) {
		User user = userRepository.findByUsername(requestDTO.getUsername()).orElseThrow(() -> new RuntimeException("User not found"));
		
		if (encoder.matches(requestDTO.getPassword(), user.getPassword())) {
			return new AuthResponseDTO(jwtUtil.generateToken(user.getUsername()));
		}
		
		throw new RuntimeException("Invalid Credentials");
	}
}

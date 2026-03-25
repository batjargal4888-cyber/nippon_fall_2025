package session115;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private long expiration;
	
	private SecretKey getSigningKey() {
		byte[] keyBytes = Decoders.BASE64.decode(secret);
 		return Keys.hmacShaKeyFor(keyBytes);
	}
	
	public String generateToken(String username) {
		return Jwts.builder().subject(username).issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(getSigningKey())
				.compact();
	}
	
	public String extractUsername (String username) {
		return Jwts.parser()
				.verifyWith(getSigningKey())
				.build()
				.parseSignedClaims(username)
				.getPayload()
				.getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser()
					.verifyWith(getSigningKey()) // Replaces setSigningKey
					.build() // Replaces parseClaimsJws
					.parseSignedClaims(token);
			return true;
			
		} catch (JwtException | IllegalArgumentException e) {
			return false;
		}
	}
}

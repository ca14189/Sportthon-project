package com.sportthon.api.service;

public interface TokenService {

	String extractUsername(String token);

	String extractRole(String token);

	Boolean validateToken(String token, String username3);

	String generateToken(String username, String string);
	
}

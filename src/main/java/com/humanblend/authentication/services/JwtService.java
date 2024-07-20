package com.humanblend.authentication.services;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JwtService {
    String extractUserName(String token);
    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);
    String generateRefreshToken (UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}

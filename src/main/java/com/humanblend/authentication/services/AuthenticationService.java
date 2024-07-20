package com.humanblend.authentication.services;


import com.humanblend.authentication.dto.AuthenticationRequest;
import com.humanblend.authentication.dto.AuthenticationResponse;
import com.humanblend.authentication.dto.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);

}

package ua.yarynych.registrationform.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.yarynych.registrationform.dto.UserRegistrationDto;
import ua.yarynych.registrationform.model.User;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
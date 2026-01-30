package com.eventify.user_service.service;

import com.eventify.user_service.entity.User;
import com.eventify.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService{

    private final UserRepository userRepository;

    public UserImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        return userRepository.save(user);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

    }

}


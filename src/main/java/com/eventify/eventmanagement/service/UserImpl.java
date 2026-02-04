package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.UserRequestDto;
import com.eventify.eventmanagement.entity.User;
import com.eventify.eventmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

  private final UserRepository userRepository;

  public UserImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void register(UserRequestDto dto) {

    if (userRepository.existsByEmail(dto.getEmail())) {
      throw new RuntimeException("Email already exists");
    }

    User user = new User();
    user.setName(dto.getName());
    user.setEmail(dto.getEmail());
    user.setPassword(dto.getPassword());

    userRepository.save(user);
  }

  @Override
  public User getByEmail(String email) {
    return userRepository
        .findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));
  }
}

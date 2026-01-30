package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.entity.User;

public interface UserService {

  User register(User user);

  User getByEmail(String email);
}

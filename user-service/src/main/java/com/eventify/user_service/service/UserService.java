package com.eventify.user_service.service;

import com.eventify.user_service.entity.User;

public interface UserService {
    User register(User user);

    User getByEmail(String email);
}

package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDto;
import com.eventify.eventmanagement.dto.request.UserRequestDto;
import com.eventify.eventmanagement.entity.User;

public interface UserService {
  void register(UserRequestDto userRequest);


  User getByEmail(String email);
}

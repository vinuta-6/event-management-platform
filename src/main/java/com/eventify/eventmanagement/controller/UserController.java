package com.eventify.eventmanagement.controller;

import com.eventify.eventmanagement.dto.request.UserRequestDto;
import com.eventify.eventmanagement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    
    this.userService = userService;
  }

  @PostMapping("/register")
  public ResponseEntity<Void> register(@RequestBody UserRequestDto userRequest) {
  userService.register(userRequest);
  return new ResponseEntity<>(HttpStatus.OK);
  }
}

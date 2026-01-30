package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDto;

public interface EventService {

  void createEvent(EventRequestDto event);
}

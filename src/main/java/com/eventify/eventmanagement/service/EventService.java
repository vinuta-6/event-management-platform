package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDto;
import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.entity.EventType;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface EventService {

  void createEvent(EventRequestDto event);


  List<Event> getAllEvents(EventType eventType);

  Event getById(Long id);

  void deleteEventById(Long id);
}

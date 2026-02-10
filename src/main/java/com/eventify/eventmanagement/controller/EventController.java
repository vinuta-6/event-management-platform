package com.eventify.eventmanagement.controller;

import com.eventify.eventmanagement.dto.request.EventRequestDto;
import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.entity.EventType;
import com.eventify.eventmanagement.service.EventService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {

  private final EventService eventService;

  public EventController(EventService eventService) {

    this.eventService = eventService;
  }

  @PostMapping
  public ResponseEntity<Void> createEvent(@RequestBody EventRequestDto eventRequest) {
    eventService.createEvent(eventRequest);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<Event>> getAllEvents(
      @RequestParam(required = false) EventType eventType) {

    return ResponseEntity.ok(eventService.getAllEvents(eventType));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Event> getEventById(@PathVariable Long id) {
    return ResponseEntity.ok(eventService.getById(id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteEventById(@PathVariable Long id) {
    eventService.deleteEventById(id);
    return ResponseEntity.noContent().build();
  }
}

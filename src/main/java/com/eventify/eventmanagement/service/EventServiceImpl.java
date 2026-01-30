package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDto;
import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.repository.EventRepository;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
  private final EventRepository eventRepository;

  public EventServiceImpl(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  @Override
  public void createEvent(EventRequestDto eventRequest) {
    var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Event event = new Event();
    event.setEventType(eventRequest.eventType());
    event.setEventDate(LocalDate.parse(eventRequest.eventDate(), formatter));
    event.setLocation(eventRequest.location());
    event.setGuestCount(eventRequest.guestCount());
    eventRepository.save(event);
  }
}

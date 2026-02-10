package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDto;
import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.entity.EventType;
import com.eventify.eventmanagement.repository.EventRepository;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
  private final EventRepository eventRepository;

  public EventServiceImpl(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  @Override
  public void createEvent(EventRequestDto eventRequest) {
    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    Event event = new Event();
    event.setEventType(EventType.valueOf(eventRequest.eventType()));
    event.setEventDate(eventRequest.eventDate());
    event.setLocation(eventRequest.location());
    event.setGuestCount(eventRequest.guestCount());
    event.setBudget(eventRequest.budget());
    event.setRatings(eventRequest.ratings());
    event.setVenue(eventRequest.venue());
    eventRepository.save(event);
  }

  @Override
  public List<Event> getAllEvents(EventType eventType) {
    if (eventType == null) {
      return eventRepository.findAll();
    }

    return eventRepository.findByEventType(eventType);
  }




  @Override
  public Event getById(Long id) {
    return eventRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
  }

  @Override
  public void deleteEventById(Long id) {

    if (!eventRepository.existsById(id)) {
      throw new RuntimeException("Event not found with id: " + id);
    }

    eventRepository.deleteById(id);
  }
}

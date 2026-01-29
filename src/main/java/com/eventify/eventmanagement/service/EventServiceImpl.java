package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDTO;
import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void createEvent(EventRequestDTO eventRequest) {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Event event = new Event();
        event.setEventType(eventRequest.eventType());
        event.setEventDate(LocalDate.parse(eventRequest.eventDate(), formatter));
        event.setLocation(eventRequest.location());
        event.setGuestCount(eventRequest.guestCount());
        eventRepository.save(event);
    }

}

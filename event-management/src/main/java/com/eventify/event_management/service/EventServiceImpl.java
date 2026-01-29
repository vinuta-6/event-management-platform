package com.eventify.event_management.service;

import com.eventify.event_management.event.Event;
import com.eventify.event_management.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

@Override
    public Event createEvent(Event event) {

        return eventRepository.save(event);
    }

}

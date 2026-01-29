package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.repository.EventRepository;
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

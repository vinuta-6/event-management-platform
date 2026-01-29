package com.eventify.eventmanagement.controller;


import com.eventify.eventmanagement.entity.Event;

import com.eventify.eventmanagement.service.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {

        this.eventService = eventService;
    }


    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

}

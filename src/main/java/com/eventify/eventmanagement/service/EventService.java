package com.eventify.eventmanagement.service;

import com.eventify.eventmanagement.dto.request.EventRequestDTO;
import com.eventify.eventmanagement.entity.Event;


public interface EventService {

    void createEvent(EventRequestDTO event);
}

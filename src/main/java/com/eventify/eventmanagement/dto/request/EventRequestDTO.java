package com.eventify.eventmanagement.dto.request;

public record EventRequestDTO(String eventType,
                              String eventDate,
                              String location,
                              Integer guestCount) {
}

package com.eventify.eventmanagement.dto.request;

public record EventRequestDto(
    String eventType, String eventDate, String location, Integer guestCount) {}

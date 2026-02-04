package com.eventify.eventmanagement.dto.request;

import java.time.LocalDate;

public record EventRequestDto(
    String eventType,
    LocalDate eventDate,
    String location,
    Integer guestCount,
    Integer budget,
    Double ratings,
    String venue) {

}

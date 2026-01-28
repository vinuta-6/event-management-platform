package com.eventify.event_management.event;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventType;
    private LocalDate eventDate;
    private String location;
    private Integer guestCount;

}

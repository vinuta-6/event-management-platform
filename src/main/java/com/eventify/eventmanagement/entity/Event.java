package com.eventify.eventmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;



@Data
@Table(name = "events")
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventType;
    private LocalDate eventDate;
    private String location;
    private Integer guestCount;

}

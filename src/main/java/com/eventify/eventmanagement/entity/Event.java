package com.eventify.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

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
  private String venue;
  private Double ratings;
  private Integer budget;
  private List<String> Services;
}

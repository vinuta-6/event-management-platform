package com.eventify.eventmanagement.repository;

import com.eventify.eventmanagement.entity.Event;
import com.eventify.eventmanagement.entity.EventType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

  List<Event> findByEventType(EventType eventType);
}

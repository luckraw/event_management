package br.com.event_management.controller;

import br.com.event_management.entities.Event;
import br.com.event_management.repositories.EventRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping
    public String getAllEvent(Model model) {
        List<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "event/list";
    }
}

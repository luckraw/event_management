package br.com.event_management.controller;

import br.com.event_management.entities.Event;
import br.com.event_management.repositories.EventRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/new")
    public String showEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "event/form";
    }

    @PostMapping
    public String createEvent(@ModelAttribute("event") @Validated Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "event/form";
        }
        eventRepository.save(event);
        return "redirect:/events";
    }

    @GetMapping("/{id}/edit")
    public String showEditEventForm(@PathVariable("id") Long id, Model model) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid event id: " + id));
        model.addAttribute("event", event);
        return "event/edit";
    }

    @PostMapping("/{id}")
    public String updateEvent(@PathVariable("id") Long id, @ModelAttribute("event") @Validated Event event,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "event/edit";
        }
        event.setId(id);
        eventRepository.save(event);
        return "redirect:/events";
    }

    @PostMapping("/{id}/delete")
    public String deleteEvent(@PathVariable("id") Long id) {
        eventRepository.deleteById(id);
        return "redirect:/events";
    }
}

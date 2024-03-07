package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static List<Event> events;

    public EventManager() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addParticipant(Event event, Participant participant) {
        event.addParticipant(participant);
    }

    public void removeParticipant(Event event, int participantId) {
        event.removeParticipant(participantId);
    }

    public static List<Event> getEvents() {
        return events;
    }
    static Event getEventById(int eventId) {
        for (Event event : getEvents()) {
            if (event.getId() == eventId) {
                return event;
            }
        }
        return null;
    }

}

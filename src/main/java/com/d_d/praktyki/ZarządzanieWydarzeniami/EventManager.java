package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void sortByDate() {
        Collections.sort(events, Comparator.comparing(Event::getDate));
    }

    public void displayUpcomingEvents() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println("Nadchodzące wydarzenia:");
        boolean found = false;
        for (Event event : events) {
            if (event.getDate().after(date)) {
                found = true;
                System.out.println("Id: "+ event.getId());
                System.out.println("Nazwa: " + event.getName());
                System.out.println("Data: " + sdf.format(event.getDate()));
                System.out.println("Miejsce: " + event.getLocation());
                System.out.println("Opis: " + event.getDescription());
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("Brak nadchodzących wydarzeń.");
        }
    }

    public static void displayEventDetails(int eventId){

        Event event = getEventById(eventId);
        if (event != null) {
            System.out.println("Szczegóły wydarzenia:");
            System.out.println("Nazwa: " + event.getName());
            System.out.println("Data: " + event.getDate());
            System.out.println("Miejsce: " + event.getLocation());
            System.out.println("Opis: " + event.getDescription());
            System.out.println("Lista uczestników:");
            for (Participant participant : event.getParticipants()) {
                System.out.println("- " + participant.getName());
            }
        } else {
            System.out.println("Wydarzenie o podanym identyfikatorze nie istnieje.");
        }
    }

}


package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Event {

    private int id;
    private String name;
    private Date date;
    private String place;
    private String description;
    private List<Participant> participants;


    public Event(String name, Date date, String place, String description, int id) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.id=id;
        this.description = description;
        this.participants = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }
    public void removeParticipant(int participantId) {
        participants.removeIf(p -> p.getId() == participantId);
    }

}
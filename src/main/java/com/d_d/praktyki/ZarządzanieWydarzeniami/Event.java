package com.d_d.praktyki.ZarządzanieWydarzeniami;



class Event {
    private String name;
    private String date;
    private String place;
    private String description;

    public Event(String name, String date, String place, String description) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return place;
    }

    public String getDescription() {
        return description;
    }
}
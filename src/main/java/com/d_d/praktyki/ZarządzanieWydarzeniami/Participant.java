package com.d_d.praktyki.ZarządzanieWydarzeniami;

public class Participant {
    private String name;
    private int id;

    public Participant(int id, String name){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

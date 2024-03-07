package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager eventManager = new EventManager();
        while (true) {
            System.out.println("Dostępne opcje:");
            System.out.println("1- Dodanie nowego wydarzenia\n2-Dodanie uczstnika do wydarzenia\n3-Usunięcie uczestnika");
            int choice = scanner.nextInt();
            if (choice==1) {
                System.out.println("Podaj identyfkator wydarzenia:");
                int id = scanner.nextInt();
                System.out.println("Podaj nazwę wydarzenia:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Pagoda datę wydarzenia (w formacie YYYY-MM-DD):");
                String date = scanner.nextLine();
                System.out.println("Podaj miejsce wydarzenia:");
                String location = scanner.nextLine();
                System.out.println("Podaj opis wydarzenia:");
                String description = scanner.nextLine();
                Event event = new Event(name, date, location, description,id);
                eventManager.addEvent(event);
            } else if(choice==2){
                System.out.println("Podaj identyfkator uczestnika:");
                int id = scanner.nextInt();
                System.out.println("Podaj nazwę uczestnika:");
                scanner.nextLine();
                String participantName = scanner.nextLine();

                System.out.println("Podaj identyfikator wydarzenia:");
                int eventId = scanner.nextInt();
                scanner.nextLine();

                Event event = eventManager.getEventById(eventId);
                if (event != null) {
                    Participant participant = new Participant(id,participantName);
                    eventManager.addParticipant(event, participant);
                    System.out.println("Dodano uczestnika " + participantName + " do wydarzenia " + event.getName());
                } else {
                    System.out.println("Wydarzenie o podanym identyfikatorze nie istnieje.");
                }
            }else if(choice==3){
                System.out.println("Podaj identyfikator wydarzenia:");
                int eventId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj identyfikator uczestnika do usunięcia:");
                int participantId = scanner.nextInt();
                scanner.nextLine();

                Event event = eventManager.getEventById(eventId);
                if (event != null) {
                    eventManager.removeParticipant(event, participantId);
                    System.out.println("Usunięto uczestnika z wydarzenia.");
                } else {
                    System.out.println("Wydarzenie o podanym identyfikatorze nie istnieje.");
                }

            }
        }

    }
}

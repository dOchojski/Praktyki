package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        EventManager eventManager = new EventManager();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("Dostępne opcje:");
            System.out.println("1-Dodanie nowego wydarzenia\n2-Dodanie uczstnika do wydarzenia" +
                    "\n3-Usunięcie uczestnika\n4-Pokazanie wydarzenia\n5-Wyświtl Szczegóły wydarzenia");
            int choice = scanner.nextInt();
            if (choice==1) {

                System.out.println("Podaj identyfkator wydarzenia:");
                int id = scanner.nextInt();
                System.out.println("Podaj nazwę wydarzenia:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Podaj datę wydarzenia (w formacie YYYY-MM-DD):");
                String dates = scanner.nextLine();
                System.out.println("Podaj miejsce wydarzenia:");
                String location = scanner.nextLine();
                System.out.println("Podaj opis wydarzenia:");
                Date eventDate = sdf.parse(dates);

                String description = scanner.nextLine();
                Event event = new Event(name, eventDate, location, description,id);
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

                Event event = EventManager.getEventById(eventId);

                if (event != null) {
                    Participant participant = new Participant(id,participantName);
                    eventManager.addParticipant(event, participant);
                    System.out.println("Dodano uczestnika " + participantName + " do wydarzenia " + event.getName());
                } else {
                    System.out.println("Wydarzenie o podanym identyfikatorze nie istnieje.");
                }

            }else if(choice==3) {


                System.out.println("Podaj identyfikator wydarzenia:");
                int eventId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj identyfikator uczestnika do usunięcia:");
                int participantId = scanner.nextInt();
                scanner.nextLine();
                Event event = EventManager.getEventById(eventId);

                if (event != null) {
                    eventManager.removeParticipant(event, participantId);
                    System.out.println("Usunięto uczestnika z wydarzenia.");
                } else {
                    System.out.println("Wydarzenie o podanym identyfikatorze nie istnieje.");
                }


            }else if(choice==4){
                eventManager.sortByDate();
                eventManager.displayUpcomingEvents();
            }
            else if(choice==5){
                System.out.println("Podaj identyfikator wydarzenia:");
                int eventId = scanner.nextInt();
                scanner.nextLine();
                EventManager.displayEventDetails(eventId);
            }
        }

    }
}

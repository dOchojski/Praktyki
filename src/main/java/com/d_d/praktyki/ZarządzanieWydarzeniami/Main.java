package com.d_d.praktyki.ZarządzanieWydarzeniami;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager eventManager = new EventManager();

        while (true) {
            System.out.println("Czy chcesz dodać nowe wydarzenie? (1=tak/2-nie)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("1")) {
                System.out.println("Podaj nazwę wydarzenia:");
                String name = scanner.nextLine();
                System.out.println("Podaj datę wydarzenia (w formacie YYYY-MM-DD):");
                String date = scanner.nextLine();
                System.out.println("Podaj miejsce wydarzenia:");
                String location = scanner.nextLine();
                System.out.println("Podaj opis wydarzenia:");
                String description = scanner.nextLine();
                Event event = new Event(name, date, location, description);
                eventManager.addEvent(event);
            } else {
                break;
            }
        }

    }
}

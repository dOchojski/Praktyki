package com.d_d.praktyki.hospitalsystem;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private List<Patient> patientQueue;

    public Hospital() {
        this.patientQueue = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        if (patientQueue.size() < 10) {
            patientQueue.add(patient);
            System.out.println("Pacjent pomyślnie dodany.");
        } else {
            System.out.println("Szpital jest pełny. Nie można dodać pacjenta.");
        }
    }

    public void displayPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("Brak pacjentów w kolejce");
        } else {
            System.out.println("Lista pacjentów:");
            for (Patient patient : patientQueue) {
                System.out.println(patient);
            }
        }
    }
}

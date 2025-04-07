package com.d_d.praktyki.SecondWeek.Szpital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Patient> patientQueue;

    public Hospital() {
        patientQueue = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        if (patientQueue.size() < 10) {
            patientQueue.add(patient);
            System.out.println("Pacjent " + patient.getFirstName() + " " + patient.getLastName() + " został dodany do kolejki.");
        } else {
            System.out.println("Limit pacjentów został już wyczerpany.");
        }
    }

    public void displayPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("Brak zapisanych pacjentów.");
        } else {
            System.out.println("Lista zapisanych pacjentów:");
            for (Patient patient : patientQueue) {
                System.out.println(patient.getFirstName() + " " + patient.getLastName() + " - PESEL: " + patient.getPesel());
            }
        }
    }
}

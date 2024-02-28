package com.d_d.praktyki.loops.hospital;

public class Hospital {
    private int patientsCount = 0;
    private final int MAX_PATIENTS = 10;
    private final Patient[] patients = new Patient[MAX_PATIENTS];

    public Hospital() {}

    public boolean add(Patient patient) {
        if (patientsCount >= MAX_PATIENTS)
            return false;

        patients[patientsCount] = patient;
        patientsCount++;
        return true;
    }

    public void printPatients() {
        for (int i = 0; i < patientsCount; i++) {
            final Patient patient = patients[i];

            // should entry end with comma or is it last element
            String entryEnd = ((i - 1 != patientsCount) ? ", " : "\n");

            String entry = patient.getName() + " " + patient.getSurname() + entryEnd;
            System.out.print(entry);
        }
    }
}

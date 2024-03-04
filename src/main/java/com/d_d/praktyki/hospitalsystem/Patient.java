package com.d_d.praktyki.hospitalsystem;

class Patient {
    private String firstName;
    private String lastName;
    private String pesel;

    public Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "Imię='" + firstName + '\'' +
                ", Nazwisko='" + lastName + '\'' +
                ", Pesel='" + pesel + '\'' +
                '}';
    }
}

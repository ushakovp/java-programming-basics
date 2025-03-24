package org.javaguru.student.lesson_3.level_4;

public class Appointment {
    String FirstLastNamePatient;
    String diagnosis;
    Double price;

    public Appointment(String firstLastNamePatient, String diagnosis, Double price) {
        FirstLastNamePatient = firstLastNamePatient;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getFirstLastNamePatient() {
        return FirstLastNamePatient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Double getPrice() {
        return price;
    }
}

package org.javaguru.student.lesson_3.level_4;

import java.time.LocalDate;

public class Schedule {
    String FirstLastName;
    String Speciality;
    LocalDate DateOfAppointment;
    Appointment earlyAppointment;
    Appointment late;

    public Schedule(String firstLastName, String speciality, LocalDate dateOfAppointment, Appointment earlyAppointment, Appointment late) {
        FirstLastName = firstLastName;
        Speciality = speciality;
        DateOfAppointment = dateOfAppointment;
        this.earlyAppointment = earlyAppointment;
        this.late = late;
    }

    public String getFirstLastName() {
        return FirstLastName;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public LocalDate getDateOfAppointment() {
        return DateOfAppointment;
    }

    public Appointment getEarlyAppointment() {
        return earlyAppointment;
    }

    public Appointment getLate() {
        return late;
    }
}

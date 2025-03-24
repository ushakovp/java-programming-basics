package org.javaguru.student.lesson_3.level_4;

import java.time.LocalDate;

public class DoctorTimetableApp {

    public static void main(String[] args) {
        Schedule schedule = new Schedule("Peter Griffin",
                "dentist",
                LocalDate.of(2020, 12, 12),
                new Appointment("Vasia Pervitsky", "caries", 1_000_000.00),
                new Appointment("Denis Pervitsky", "toothache", 1_000_000.00)
                );

        Schedule schedule2 = new Schedule("Peter Griffin",
                "dentist",
                LocalDate.of(2020, 12, 12),
                new Appointment("Vasia Pervitsky", "caries", 1_000_000.00),
                new Appointment("Denis Pervitsky", "toothache", 1_000_000.00)
        );
    }

}

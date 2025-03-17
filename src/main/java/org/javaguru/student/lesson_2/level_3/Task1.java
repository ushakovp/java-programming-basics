package org.javaguru.student.lesson_2.level_3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x "+ i + " = " + number * i);
        }
    }
}

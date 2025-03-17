package org.javaguru.student.lesson_2.level_3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        var number3 = scanner.nextInt();
        System.out.println("Average is = " + (number1 + number2 + number3) / 3.0);
    }
}

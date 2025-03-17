package org.javaguru.student.lesson_2.level_3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextDouble();
        System.out.println("Perimeter is = " + 2 * Math.PI * number);
        System.out.println("Area is = " + Math.PI * number * number);

    }
}

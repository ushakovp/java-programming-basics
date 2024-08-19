package org.javaguru.mentor.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

public class TriangleSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        double p = (a + b + c) / (double) 2;

        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Triangle square = " + square);

    }

}

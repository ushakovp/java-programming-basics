package org.javaguru.student.lesson_2.level_2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+ name +" пользователь!");
    }
}

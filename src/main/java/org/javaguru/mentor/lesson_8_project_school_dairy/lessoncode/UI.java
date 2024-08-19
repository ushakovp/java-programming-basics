package org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode;

import java.util.Scanner;

class UI {

    public static void main(String[] args) {
        UI ui = new UI();
        BusinessLogic businessLogic = new BusinessLogic();

        while (true) {
            ui.printMenu();
            int userChoice = ui.getUserChoice();
            ui.executeUserChoice(businessLogic, userChoice);
        }

    }

    private void printMenu() {
        System.out.println("");
        System.out.println("Program menu: ");
        System.out.println("1. Add new mark");
        System.out.println("2. Show all marks");
        System.out.println("3. Show best mark by subject");
        System.out.println("4. Exit");
        System.out.println("");
    }

    private int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select menu item to execute:");
        return Integer.parseInt(scanner.nextLine());
    }

    private void executeUserChoice(BusinessLogic businessLogic,
                                   int userChoice) {
        if (userChoice == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            System.out.println("Enter mark:");
            int mark = Integer.parseInt(scanner.nextLine());

            businessLogic.addMark(subject, mark);
        }

        if (userChoice == 2) {
            System.out.println("All marks:");
            for (Mark mark : businessLogic.getAllMarks()) {
                System.out.println(mark.getSubject() + " => " + mark.getMark());
            }
        }

        if (userChoice == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            int bestMark = businessLogic.findBestMark(subject);
            System.out.println("Best mark = " + bestMark);
        }

        if (userChoice == 4) {
            System.exit(0);
        }
    }

}

package org.javaguru.student.lesson_3.level_1;

public class RobotApp {

    public static void main(String[] args) {
        var robot = new Robot("R2D2");
        var robot2 = new Robot("C3PO");
        System.out.println(robot.getName());
        System.out.println(robot2.getName());
        robot.setName("test");
        robot2.setName("test2");
        System.out.println(robot.getName());
        System.out.println(robot2.getName());

    }
}

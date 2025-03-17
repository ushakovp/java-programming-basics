package org.javaguru.student.lesson_3.level_2;

public class CarApp {

    public static void main(String[] args) {
        var car = new Car("BMW", "Black", 10000);
        var car2 = new Car("Audi", "Red", 20000);
        var car3 = new Car("Mercedes", "White", 30000);
        System.out.println(car.brand + " " + car.color + " " + car.price);
        System.out.println(car2.brand + " " + car2.color + " " + car2.price +
                " " + car3.brand + " " + car3.color + " " + car3.price);
        car.setPrice(15000);
        car2.setColor("Blue");
        car3.setBrand("Audi");
        System.out.println(car.brand + " " + car.color + " " + car.price);
        System.out.println(car2.brand + " " + car2.color + " " + car2.price);
        System.out.println(car3.brand + " " + car3.color + " " + car3.price);
    }
}

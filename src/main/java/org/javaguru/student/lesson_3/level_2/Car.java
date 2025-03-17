package org.javaguru.student.lesson_3.level_2;

public class Car {
    String brand;
    String color;
    Integer price;

    public Car(String brand, String color, Integer price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

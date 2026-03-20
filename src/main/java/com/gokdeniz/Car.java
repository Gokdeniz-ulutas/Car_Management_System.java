package com.gokdeniz;

import java.util.ArrayList;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car() {
    }

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showCars(ArrayList<Car> car) {
        int j = 1;
        for (Car i : car) {
            System.out.println(j + " - " + i.toString());
            System.out.println();
            j++;
        }
    }

    public void deleteCars(ArrayList<Car> car, int index) {
        if (index > 0 && index <= car.size()) {
            car.remove(index - 1);
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void searchCars(ArrayList<Car> car, String brand, String model) {
        int i = 1;
        boolean found = false;

        for (Car cars : car) {
            if (cars.getModel().equalsIgnoreCase(model) && cars.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(i + ". " + cars.toString());
                found = true;
            }
            i++;
        }

        if (!found) {
            System.out.println("No matching car found.");
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                " Model: " + model +
                " Year: " + year +
                " Price: " + price;
    }
}
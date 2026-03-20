package com.gokdeniz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car car = null;
        String options = "\n1-Add Car\n"+"2-Delete Car\n"+"3-Search Car \n"+"4-List Cars\n"+"5-Quit";

        while(true){

            System.out.println(options);
            System.out.println("\nChoose the option: ");
            String select = scanner.nextLine();

            if(select.equals("1")){

                System.out.println("Please admit the cars informations : ");
                System.out.print("Enter car's brand :");
                String brand = scanner.nextLine();
                System.out.print("Enter car's model :");
                String model = scanner.nextLine();
                System.out.print("Enter car's year :");
                int year = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter car's price :");
                double price = scanner.nextDouble();
                scanner.nextLine();
                car = new Car(brand, model, year, price);
                cars.add(car);
                System.out.println("Successfully added...");
            }
            else if(select.equals("2")){
                if(car == null){
                    System.out.println("Please add at least one car then select second option.");
                    continue;
                }
                car.showCars(cars);
                System.out.println("Please enter which car do you want to delete :  ");
                int index = scanner.nextInt();
                scanner.nextLine();
                car.deleteCars(cars,index);

            }
            else if(select.equals("3")){
                if(car == null){
                    System.out.println("Please add at least one car then select second option.");
                    continue;
                }
                System.out.print("\nPlease firstly admit brand : ");
                String brand = scanner.nextLine();
                System.out.print("\nPlease secondly admit model : ");
                String model = scanner.nextLine();
                car.searchCars(cars,brand,model);


            }
            else if(select.equals("4")){
                car.showCars(cars);

            }
            else if(select.equals("5")){
                System.out.println("Process Finished");
                break;
            }

        }
    }
}
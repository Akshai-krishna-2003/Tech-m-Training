package Oops;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // Inputs  taken
        System.out.println("Enter inputs for the car:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Car #" + i + ": " + cars[i]);
            System.out.println("Select 1 for normal car");
            System.out.println("Select 2 for electric car");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the make of car:");
                    String make = sc.next();
                    System.out.println("Enter model number:");
                    String model = sc.next();
                    System.out.println("Enter year:");
                    int year = sc.nextInt();
                    cars[i] = new Car(make, model, year);
                    break;

                case 2:
                    System.out.println("Enter the make of car:");
                    String make2 = sc.next();
                    System.out.println("Enter model number:");
                    String model2 = sc.next();
                    System.out.println("Enter year:");
                    int year2 = sc.nextInt();
                    System.out.println("Enter battery levels: ");
                    double battery = Double.parseDouble(sc.next());
                    cars[i] = new ElectricCar(make2, model2, year2, battery);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }

            // Calling startEngine() method
            for (Car car : cars) {
                car.startEngine();
            }

        }
    }
}


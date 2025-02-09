package Oops;

public class ElectricCar extends Car {

    private double battery;

    public ElectricCar(String make, String model, int year, double battery) {
        super(make, model, year);
        this.battery = battery;
    }

    public void chargeBattery() {
        System.out.println("Battery charged: " + battery);
    }

}

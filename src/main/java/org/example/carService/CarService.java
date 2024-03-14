package org.example.carService;


public class CarService {

    public static void main(String[] args) {

        Car car = new Car(4, 270, "Бензиновый", "Toyota", "Camry");
        visitServiceStation(car);

        Bicycle bicycle = new Bicycle(2, 55, "Горный");
        visitServiceStation(bicycle);

        Truck truck = new Truck(6, 120, "Дизельный", 7);
        visitServiceStation(truck);

    }

    public static void visitServiceStation(WheeledTransport wheeledTransport) {
        wheeledTransport.service();

    }
}
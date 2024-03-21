package org.example.carService;


import java.util.Scanner;

public class CarService {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип транспорта");
        String type = scanner.nextLine();

        WheeledTransport wheeledTransport = null;
        if (type.equalsIgnoreCase("car")) {
            wheeledTransport = new Car(4, 270, "Бензиновый", "Toyota", "Camry");
        } else if ( type.equalsIgnoreCase("bicycle")) {
            wheeledTransport = new Bicycle(2, 55, "Горный");
        } else if (type.equalsIgnoreCase("truck")) {
            wheeledTransport = new Truck(6, 120, "Дизельный", 7);
        } else {
            System.out.println("Такого транспорта нет");
            return;
        }

        visitServiceStation(wheeledTransport);


//        Car car = new Car(4, 270, "Бензиновый", "Toyota", "Camry");
//        visitServiceStation(car);
//
//        Bicycle bicycle = new Bicycle(2, 55, "Горный");
//        visitServiceStation(bicycle);
//
//        Truck truck = new Truck(6, 120, "Дизельный", 7);
//        visitServiceStation(truck);

    }

    public static void visitServiceStation(WheeledTransport wheeledTransport) {

        wheeledTransport.service();

        if (wheeledTransport instanceof Car){
            Car car = (Car) wheeledTransport;
            car.drive();
        }else if (wheeledTransport instanceof Bicycle){
            Bicycle bicycle = (Bicycle) wheeledTransport;
            bicycle.jump();
        }else if (wheeledTransport instanceof Truck){
            Truck truck = (Truck) wheeledTransport;
            truck.loading();
        }
    }
}
package org.example.carService;


import java.util.Scanner;

public class CarService {

        public static void main (String[]args){

            Car transport = new Car.Builder()
                    .brand("Ford")
                    .model("Focus")
                    .wheelCount(4)
                    .maxSpeed(270)
                    .enginesType("Бензиновый")
                    .build();

            Car transport1 = new Car.Builder()
                    .brand("Kia")
                    .model("Rio")
                    .wheelCount(4)
                    .maxSpeed(230)
                    .enginesType("Бензиновый")
                    .build();

            Bicycle transport2 = new Bicycle(2, 45, "Горный");

            Bicycle transport3 = new Bicycle(2, 80, "Шоссейный");

            Truck transport4 = new Truck(4, 125, "Бензиновый", 7);

            Truck transport5 = new Truck(6, 190, "Бензиновый", 20);


            ServiceStation ser = new ServiceStation();

            WheeledTransport[] trans = {transport, transport1, transport2, transport3, transport4, transport5};
            for (WheeledTransport dd : trans) {
                ser.visitServiceStation(dd);
            }
        }
    }

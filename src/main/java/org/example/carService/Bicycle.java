package org.example.carService;

public class Bicycle extends WheeledTransport {

    private String typeOfBike;

    public Bicycle(int wheelCount, int maxSpeed, String typeOfBike) {
        super(wheelCount, maxSpeed);
        this.typeOfBike = typeOfBike;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    public void setTypeOfBike(String typeOfBike) {
        this.typeOfBike = typeOfBike;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обсужено навесное оборудоввание велосипеда типа " + typeOfBike);

    }
}

package org.example.carService;

public final class Car extends MotorTransport {

    private String brand;

    private String model;

    public Car(int wheelCount, int maxSpeed, String enginesType, String brand, String model) {
        super(wheelCount, maxSpeed, enginesType);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обсужен автомобиль " + brand + " " + model);
    }
    public final void drive() {
        System.out.println("Автомобиль " + brand + " может передвигаться");
    }
}

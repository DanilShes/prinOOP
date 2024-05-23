package org.example.carService;

public final class Car extends MotorTransport {

    private String brand;

    private String model;

    public Car(Builder builder) {
        super(builder.wheelCount, builder.maxSpeed, builder.enginesType);
        this.brand = builder.brand;
        this.model = builder.model;
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
        drive();
        carService();
    }

    public final void drive() {
        System.out.println("Автомобиль " + brand + " может передвигаться");
    }

    public void carService() {
        System.out.println("Обсужен автомобиль " + brand + " " + model);
    }

    public static class Builder {

        private String brand;
        private String model;

        private int wheelCount;

        private int maxSpeed;

        private String enginesType;

        public Builder() {
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder wheelCount(int wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        public Builder enginesType(String enginesType) {
            this.enginesType = enginesType;
            return this;
        }

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

package org.example.carService;

public final class Truck extends MotorTransport {

    private int cargoTruck;

    public Truck(int wheelCount, int maxSpeed, String enginesType, int cargoTruck) {
        super(wheelCount, maxSpeed, enginesType);
        this.cargoTruck = cargoTruck;
    }

    public int getCargoTruck() {
        return cargoTruck;
    }

    public void setCargoTruck(int cargoTruck) {
        this.cargoTruck = cargoTruck;
    }

    @Override
    public void service() {
        super.service();
        loading();
        truckService();
    }

    public final void loading() {
        System.out.println("Грузовик с грузоподъемностью " + cargoTruck + " тонн можно загружать");
    }

    public void truckService() {
        System.out.println("Грузоподъемность " + cargoTruck + " тонн");
    }
}

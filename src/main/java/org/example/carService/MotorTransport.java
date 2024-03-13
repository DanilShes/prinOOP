package org.example.carService;

public class MotorTransport extends WheeledTransport {

    private String enginesType;

    public MotorTransport(int wheelCount, int maxSpeed, String enginesType) {
        super(wheelCount, maxSpeed);
        this.enginesType = enginesType;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслуживание двигателя типа " + enginesType);
    }
}

package org.example.carService;

public class WheeledTransport {

    private int wheelCount;

    private int maxSpeed;

    public WheeledTransport(int wheelCount, int maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колес - " + wheelCount);
    }
}

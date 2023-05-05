package Bike;

class Bike {
    // Attributes
    private int gear;
    private int speed;

    // Constructor
    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Methods

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear +
                "\nspeed of bicycle is " + speed);
    }
}
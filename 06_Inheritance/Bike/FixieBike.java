package Bike;

public class FixieBike extends Bike {
    // Attributes
    protected int wheelSize;

    // Constructor
    public FixieBike(int gear, int speed, int wheelSize) {
        super(gear, speed); // super() memanggil constructor dari superclass
        this.wheelSize = wheelSize;
    }

    // Methods

    public void setWheelSize(int size) {
        wheelSize = size;
    }

    @Override
    public String toString() {
        return (super.toString() +
            "\nwheel size is " + wheelSize + "\n");
    }

}

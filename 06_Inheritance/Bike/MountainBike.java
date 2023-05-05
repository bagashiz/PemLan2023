package Bike;

public class MountainBike extends Bike {
    // Attributes
    protected int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed); // super() memanggil constructor dari superclass
        this.seatHeight = seatHeight;
    }

    // Methods

    public void setSeatHeight(int height) {
        seatHeight = height;
    }

    @Override
    public String toString() {
        return (super.toString() +
            "\nseat height is " + seatHeight + "\n");
    }
}

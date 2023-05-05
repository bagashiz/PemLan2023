package Bike;

public class MainBike {
    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        mb.applyBrake(10);
        mb.setSpeed(12);
        mb.setGear(12);
        System.out.println(mb.toString());

        FixieBike fb = new FixieBike(1, 50, 20);
        System.out.println(fb.toString());
    }
}

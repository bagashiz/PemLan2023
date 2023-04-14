public class Finals {

    // final static variable
    final static int x = 100;

    // final method
    final void finalMethod() {
        System.out.println("dari final method");
    }

    public static void main(String[] args) {
        // final variable
        final int a = 10;

        System.out.println("nilai a: " + a); // 10
        System.out.println("nilai x: " + x); // 100
    }
}

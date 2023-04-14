public class Statics {

    // static variable
    static int a = 10;
    static String s = "Hello";

    // static block
    static {
        System.out.println("dari static block");
    }

    // static method
    static void staticMethod() {
        System.out.println("dari static method");
    }

    // non-static method
    void nonStaticMethod() {
        System.out.println("dari non-static method");
    }

    // main method (static)
    public static void main(String[] args) {
        System.out.println("nilai a: " + a);
        System.out.println("dari main method");

        staticMethod(); // bisa dipanggil tanpa membuat objek

        Statics obj = new Statics();
        obj.nonStaticMethod(); // harus membuat objek terlebih dahulu
    }
}
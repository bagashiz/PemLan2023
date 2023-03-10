/**
 * Procedural
 */
public class Procedural {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;

        int luas = luas(panjang, lebar);
        int keliling = keliling(panjang, lebar);

        display(panjang, lebar, luas, keliling);
    }

    static int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    static int keliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    static void display(int panjang, int lebar, int luas, int keliling) {
        System.out.println("Panjang Persegi Panjang: " + panjang);
        System.out.println("Lebar Persegi Panjang: " + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
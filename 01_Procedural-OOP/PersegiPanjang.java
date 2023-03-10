/**
 *  PersegiPanjang
 */
public class PersegiPanjang {
    // atribut
    private int panjang;
    private int lebar;

    // setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }


    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // getter
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // method
    public int luas() {
        return panjang * lebar;
    }

    public int keliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("Panjang Persegi Panjang: " + panjang);
        System.out.println("Lebar Persegi Panjang: " + lebar);
        System.out.println("Luas Persegi Panjang: " + luas());
        System.out.println("Keliling Persegi Panjang: " + keliling());
    }
}

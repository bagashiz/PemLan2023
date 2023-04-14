public class Burung {
    private String nama;
    private static int jumlah;

    Burung(String nama) {
        this.nama = nama;
        jumlah++;
    }

    public void terbang() {
        System.out.println("Burung " + this.nama + " sedang terbang");
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getNama() {
        return nama;
    }
}

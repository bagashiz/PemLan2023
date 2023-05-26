
// import io packages untuk membaca file
import java.io.*;

class CheckedException {
    public static void main(String[] args) {
        // deklarasi variabel lokasi file
        String filePath = "test.txt";

        try {
            
        // buat objek file reader untuk membaca file
        FileReader file = new FileReader(filePath); // ! Error: file tidak ditemukan

        // buat objek file input stream untuk membaca file
        BufferedReader fileInput = new BufferedReader(file);

        // print 3 baris pertama
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }

        fileInput.close();

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        // tutup koneksi file
    }
}

public class UncheckedException {
    public static void main(String[] args) {
        try {
            
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println(numbers[10]); //! Error: tidak ada index ke-10

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("index tidak ditemukan");
        }
    }
}

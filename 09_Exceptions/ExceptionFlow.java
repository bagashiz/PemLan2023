public class ExceptionFlow {
    public static void main(String[] args) {
        try {
            int dibagi = 10;
            int pembagi = 2; // ! Error: pembagian dengan 0

            int result = divide(dibagi, pembagi);

            System.out.println("Hasil: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

            System.out.println("blok ini selalu dijalankan");

        }
    }

    // method untuk membagi 2 bilangan bulat
    static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Pembagian dengan 0");
        }

        return dividend / divisor;
    }
}

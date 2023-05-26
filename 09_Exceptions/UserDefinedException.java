// CustomException merupakan class untuk membuat objek exception sendiri
class CustomException extends Exception {
    // constructor untuk membuat objek exception
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            boolean isTrue = false;

            if (!isTrue) {
                throw new CustomException("Nilai isTrue false");
            }

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

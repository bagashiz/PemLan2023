import Service.*;

public class Main {
    public static void main(String[] args) {
        // instansiasi service CRUD user dan product
        UserServiceImpl userService = new UserServiceImpl();
        ProductServiceImpl productService = new ProductServiceImpl();

        // Membuat user
        userService.createUser("john_doe", "john.doe@example.com");

        // Membuat produk
        productService.createProduct("Keyboard", 50.0);

        // Melihat user
        userService.readUser("john_doe");

        // Melihat user
        productService.readProduct("Keyboard");

        System.out.println("==========");

        // Mengupdate user
        userService.updateUser("john_doe", "john.doe@gmail.com");

        // Mengupdate produk
        productService.updateProduct("Keyboard", 55.0);

        // Melihat user
        userService.readUser("john_doe");

        // Melihat user
        productService.readProduct("Keyboard");

        System.out.println("==========");

        // Menghapus user
        userService.deleteUser("john_doe");

        // Menghapus produk
        productService.deleteProduct("Keyboard");

        // Melihat user
        userService.readUser("john_doe");

        // Melihat user
        productService.readProduct("keyboard");
    }
}
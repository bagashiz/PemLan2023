package Service;

import Entity.Product;

// interface untuk operasi CRUD entity Product
interface ProductService {
    void createProduct(String name, double price);

    void readProduct(String name);

    void updateProduct(String name, double newPrice);

    void deleteProduct(String name);
}

// implementasi ProductService
public class ProductServiceImpl implements ProductService {
    private Product[] products;
    private int productCount;

    public ProductServiceImpl() {
        this.products = new Product[10]; // maksimal 10 produk
        this.productCount = 0;
    }

    @Override
    public void createProduct(String name, double price) {
        // Cek apakah sudah ada produk dengan nama yang sama
        if (findProductByName(name) != -1) {
            System.out.println("Produk sudah ada. Gagal membuat produk.");
            return;
        }

        // Cek apakah sudah mencapai batas maksimal produk
        if (productCount == products.length) {
            System.out.println("Kapasitas produk penuh. Gagal membuat produk.");
            return;
        }

        Product newProduct = new Product(name, price);
        products[productCount] = newProduct;
        productCount++;

        System.out.println("Produk " + name + " berhasil dibuat.");
    }

    @Override
    public void readProduct(String name) {
        int index = findProductByName(name);
        if (index != -1) {
            Product product = products[index];
            System.out.println("Nama: " + product.getName());
            System.out.println("Harga: " + product.getPrice());
        } else {
            System.out.println("Produk " + name + " tidak ditemukan.");
        }
    }

    @Override
    public void updateProduct(String name, double newPrice) {
        int index = findProductByName(name);
        if (index != -1) {
            Product product = products[index];
            product.setPrice(newPrice);
            System.out.println("Produk " + name + " berhasil diperbarui.");
        } else {
            System.out.println("Produk " + name + " tidak ditemukan. Gagal memperbarui produk.");
        }
    }

    @Override
    public void deleteProduct(String name) {
        int index = findProductByName(name);
        if (index != -1) {
            Product[] newProducts = new Product[products.length - 1];
            for (int i = 0, j = 0; i < products.length; i++) {
                if (i != index) {
                    newProducts[j] = products[i];
                    j++;
                }
            }
            products = newProducts;
            productCount--;

            System.out.println("Produk " + name + " berhasil dihapus.");
        } else {
            System.out.println("Produk " + name + " tidak ditemukan. Gagal menghapus produk.");
        }
    }

    // Method untuk mencari produk berdasarkan nama
    private int findProductByName(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}

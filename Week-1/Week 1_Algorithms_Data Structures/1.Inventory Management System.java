import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagement {
    private Map<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public Product getProduct(int productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        Product product1 = new Product(1, "Laptop", 10, 1000.0);
        Product product2 = new Product(2, "Mouse", 50, 20.0);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println(inventory.getProduct(1).productName); // Output: Laptop
        inventory.updateProduct(new Product(1, "Laptop", 8, 950.0));
        System.out.println(inventory.getProduct(1).quantity); // Output: 8
        inventory.deleteProduct(2);
        System.out.println(inventory.getProduct(2)); // Output: null
    }
}

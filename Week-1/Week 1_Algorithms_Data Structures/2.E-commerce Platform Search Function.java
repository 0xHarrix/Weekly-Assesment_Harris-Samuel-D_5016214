class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchFunction {
    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].productName.compareTo(name);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mouse", "Electronics"),
            new Product(3, "Keyboard", "Electronics"),
            new Product(4, "Monitor", "Electronics")
        };

        System.out.println(linearSearch(products, "Mouse")); // Output: 1
        System.out.println(binarySearch(products, "Keyboard")); // Output: 2
    }
}

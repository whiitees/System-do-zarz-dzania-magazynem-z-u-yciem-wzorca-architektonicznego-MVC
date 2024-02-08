// Model
public class Product {
    private int id;
    private String name;
    private int quantity;

    // Getters and setters
}

// View
public class InventoryView {
    public void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getId() + ": " + product.getName() + " - Quantity: " + product.getQuantity());
        }
    }
}

// Controller
public class InventoryController {
    private List<Product> products;
    private InventoryView view;

    public InventoryController(List<Product> products, InventoryView view) {
        this.products = products;
        this.view = view;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        view.displayProducts(products);
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        InventoryView view = new InventoryView();
        InventoryController controller = new InventoryController(products, view);

        // Dodawanie produktów
        controller.addProduct(new Product(1, "Laptop", 10));
        controller.addProduct(new Product(2, "Smartphone", 20));

        // Wyświetlanie produktów
        controller.displayProducts();
    }
}

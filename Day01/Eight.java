import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;
    
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        }
        return false;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public boolean setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
            return true;
        }
        return false;
    }
    
    public boolean addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            return true;
        }
        return false;
    }
    
    public boolean removeStock(int amount) {
        if (0 < amount && amount <= quantity) {
            quantity -= amount;
            return true;
        }
        return false;
    }
    
    public String displayInfo() {
        return String.format("ID : %d | Name : %s | Price : $%.2f | Quantity : %d", productId, name, price, quantity);
    }
}

class FruitProduct extends Product {
    private String origin;
    private boolean isOrganic;
    
    public FruitProduct(int productId, String name, double price, int quantity, String origin, boolean isOrganic){
        super(productId, name, price, quantity);
        this.origin = origin;
        this.isOrganic = isOrganic;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public boolean isOrganic() {
        return isOrganic;
    }
    
    @Override
    public String displayInfo() {
        String organicStatus = isOrganic ? "Organic" : "Non-organic";
        return super.displayInfo() + " | Origin : " + origin + " | " + organicStatus;
    }
}

class VegetableProduct extends Product {
    private boolean isSeasonal;
    private String farmSource;
    
    public VegetableProduct(int productId, String name, double price, int quantity, boolean isSeasonal, String farmSource){
        super(productId, name, price, quantity);
        this.isSeasonal = isSeasonal;
        this.farmSource = farmSource;
    }
    
    public boolean isSeasonal() {
        return isSeasonal;
    }
    
    public String getFarmSource() {
        return farmSource;
    }
    
    @Override
    public String displayInfo() {
        String seasonalStatus = isSeasonal ? "Seasonal" : "Non-seasonal";
        return super.displayInfo() + " | " + seasonalStatus + " | Farm : " + farmSource;
    }
}

class GroceryProduct extends Product {
    private String brand;
    private String expiryDate;
    
    public GroceryProduct(int productId, String name, double price, int quantity, String brand, String expiryDate) {
        super(productId, name, price, quantity);
        this.brand = brand;
        this.expiryDate = expiryDate;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
    
    @Override
    public String displayInfo() {
        return super.displayInfo() + " | Brand : " + brand + " | Expires : " + expiryDate;
    }
}

class RetailStore {
    private String name;
    private Map<Integer, Product> products;
    
    public RetailStore(String name) {
        this.name = name;
        this.products = new HashMap<>();
    }
    
    public String addProduct(Product product) {
        int productId = product.getProductId();
        if (!products.containsKey(productId)) {
            products.put(productId, product);
            return "Product '" + product.getName() + "' added successfully.";
        }
        return "Product with ID " + productId + " already exists.";
    }
    
    public String editProduct(int productId, Double price, Integer quantity) {
        if (!products.containsKey(productId)) {
            return "Product with ID " + productId + " not found.";
        }
        
        Product product = products.get(productId);
        
        if (price != null) {
            product.setPrice(price);
        }
        
        if (quantity != null) {
            product.setQuantity(quantity);
        }
        
        return "Product '" + product.getName() + "' update successfully.";
    }
    
    public String deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            String productName = products.get(productId).getName();
            products.remove(productId);
            return "Product '" + productName + "' deleted succefully.";
        }
        return "Product with ID " + productId + " not found.";
    }
    
    public Product getProduct(int productId) {
        return products.get(productId);
    }
    
    public String displayAllProducts() {
        if (products.isEmpty()) {
            return name + " has no products in stock.";
        }
        
        StringBuilder result = new StringBuilder("Products available at " + name + ":\n");
        for (Product product : products.values()) {
            result.append(product.displayInfo()).append("\n");
        }
        return result.toString();
    }
    
    public <T extends Product> List <T> filterProductsByType(Class<T> productType) {
        List<T> filteredProducts = new ArrayList<>();
        
        for (Product product : products.values()) {
            if (productType.isInstance(product)) {
                filteredProducts.add(productType.cast(product));
            }
        }
        
        return filteredProducts;
    }
    
    public String restockProduct(int productId, int amount) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            if (product.addStock(amount)) {
                return "Added " + amount + " units to '" + product.getName() + "'. New quantity: " + product.getQuantity();
            }
            return "Invalid amount for restocking.";
        }
        return "Product with ID " + productId + " not found.";
    }
}

public class Eight {
    public static void main(String[] args) {
        //create retail store
        RetailStore freshMart = new RetailStore("Fresh Mart");

        //create products
        FruitProduct apple = new FruitProduct(101, "Red Apple", 1.99, 100, "Washington", true);
        FruitProduct banana = new FruitProduct(102, "Banana", 0.99, 150, "Costa Rica", false);
        
        VegetableProduct carrot = new VegetableProduct(201, "Carrot", 1.49, 80, true, "Green Acres Farm");
        VegetableProduct spinach = new VegetableProduct(202, "Spinach", 2.99, 50, true, "Organic Greens Co.");
        
        GroceryProduct rice = new GroceryProduct(301, "Basmati Rice", 5.99, 30, "Golden Harvest", "2025-12-31");
        GroceryProduct pasta = new GroceryProduct(302, "Spaghetti Pasta", 2.49, 45, "Pasta King", "2026-06-30");

        //add products
        System.out.println(freshMart.addProduct(apple));
        System.out.println(freshMart.addProduct(banana));
        System.out.println(freshMart.addProduct(carrot));
        System.out.println(freshMart.addProduct(spinach));
        System.out.println(freshMart.addProduct(rice));
        System.out.println(freshMart.addProduct(pasta));

        //display all products
        System.out.println(freshMart.displayAllProducts());

        //edit a product
        System.out.println(freshMart.editProduct(101, 2.29, 120));

        //restock
        System.out.println(freshMart.restockProduct(202, 25));

        //delete
        System.out.println(freshMart.deleteProduct(302));

        //display all fruits
        List<FruitProduct> fruits = freshMart.filterProductsByType(FruitProduct.class);
        System.out.println("\nFruits available:");
        for (FruitProduct fruit : fruits) {
            System.out.println(fruit.displayInfo());
        }
    }
}
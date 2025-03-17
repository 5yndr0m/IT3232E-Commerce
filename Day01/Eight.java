
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


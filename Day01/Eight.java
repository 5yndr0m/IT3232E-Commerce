
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


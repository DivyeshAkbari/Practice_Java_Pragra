package src.InventoryManagementSystem;

public class PerishableProduct extends Product {
    public PerishableProduct(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    private String expiryDate;

    public PerishableProduct(int id, String name, double price, int quantity, String expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PerishableProduct{" +
                "expiryDate='" + expiryDate + '\'' +
                '}';
    }
}

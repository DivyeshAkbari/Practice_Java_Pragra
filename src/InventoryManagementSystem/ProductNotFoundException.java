package src.InventoryManagementSystem;

public class ProductNotFoundException extends Exception{

    ProductNotFoundException(String message)
    {
        super(message);
    }
}

package src.BookStore;

public class InsufficientStockException extends Exception {
    public InsufficientStockException(String errorMessage)
    {
        super(errorMessage);
    }
}

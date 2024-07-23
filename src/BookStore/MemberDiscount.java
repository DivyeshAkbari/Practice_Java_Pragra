package src.BookStore;

public class MemberDiscount implements Discount {

    @Override
    public double applyDiscount(double price, int quantity) {
        return price * quantity * 0.9;
    }
}

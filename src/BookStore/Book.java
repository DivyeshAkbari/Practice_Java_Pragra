package src.BookStore;

public class Book {


    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int sellBook(int quantity) throws InsufficientStockException
    {
        int flag=0;
        if(this.stock<quantity)
        {
            throw new InsufficientStockException("Enter Valid qunatity We do not have that much quantity");
        }
        else {
            flag=1;
            this.stock=this.stock-quantity;
        }

        return flag;
    }
}

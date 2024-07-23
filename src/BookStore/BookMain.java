package src.BookStore;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) throws InsufficientStockException {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of the book store");
        String bookstorename=sc.next();

        List<Book> book=new ArrayList<>();

        System.out.println("Enter title of the book");
        String title=sc.next();

        System.out.println("Enter author of the book");
        String author=sc.next();

        System.out.println("Enter price of the book");
        double price=sc.nextDouble();


        System.out.println("Enter Quantity of the book");
        int quantity=sc.nextInt();


        Book b1=new Book(title,author,price,quantity);
        book.add(b1);

        BookStore bookstore=new BookStore(bookstorename,book);

        System.out.println("Enter the quantity of the book you want to purcahase");
        int q=sc.nextInt();

        System.out.println("Enter the title of the book you want to purchase");
        String t=sc.next();

        int flag;
        try{
            flag=b1.sellBook(q);
        } catch (InsufficientStockException e) {
            throw new RuntimeException(e);
        }

        if(flag==1)
        {
            bookstore.purchaseBook(t,q,true);
        }
    }
}

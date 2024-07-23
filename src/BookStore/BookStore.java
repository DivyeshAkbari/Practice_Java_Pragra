package src.BookStore;

import java.util.List;

public class BookStore {

    private  String BookStore;
    private List<Book> books;

    MemberDiscount memberDiscount=new MemberDiscount();
    public BookStore(String bookStore, List<Book> books) {
        BookStore = bookStore;
        this.books = books;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void displayBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("Book list is empty");
        }
        else {
            for(int i=0;i<books.size();i++)
            {
                Book book=books.get(i);
                System.out.println("Title of the book is "+book.getTitle());
                System.out.println("Author of the book is "+book.getAuthor());
                System.out.println("Price of the book is "+book.getPrice());
                System.out.println("Stock of the book is "+book.getStock());
            }
        }
    }

    public void purchaseBook(String title,int quantity,boolean isMember) throws InsufficientStockException
    {
        if(books.isEmpty())
        {
            System.out.println("Book list is empty");
        }
        else
        {
           int price= books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .findFirst()
                    .map(book -> (int) (book.getPrice() ))
                    .orElse(0);
           if(price==0)
           {
                System.out.println("Book not availabale");
           }
           else
           {
               if(isMember)
               {
                   double bill=memberDiscount.applyDiscount(price,quantity);

                   System.out.println("You have successfully purhchased the book "+title +" with"+" 10% discount");
                   System.out.println("You have to pay "+bill +" for purchasing the book");
               }
               else
               {
                   System.out.println("You have successfully purhchased the book "+title);
                   System.out.println("You have to pay "+ (price*quantity));
               }
           }


//            for(int i=0;i<books.size();i++)
//            {
//                Book book=books.get(i);
//                if(title.equals(book.getTitle()))
//                {
//                    if(isMember)
//                    {
//                        discount=(book.getPrice() * 10.0 / 100) * quantity;
//                        bill=book.getPrice()-discount;
//
//                        System.out.println("You have successfully purhchased the book "+book.getTitle() +" with"+" 10% discount");
//
//                        System.out.println("You have to pay "+bill +" for purchasing the book");
//                    }
//                    else {
//
//                        bill=book.getPrice()*quantity;
//                        System.out.println("You have successfully purhchased the book "+book.getTitle());
//
//                        System.out.println("You have to pay "+bill +" for purchasing the book");
//                    }
//                }
            }
        }
    }


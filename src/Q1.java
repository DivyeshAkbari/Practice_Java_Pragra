import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;
    int quantity;

    public void scanData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title");
        title = sc.nextLine();
        System.out.println("Enter the author");
        author = sc.nextLine();
        System.out.println("Enter the price");
        price = sc.nextInt();
        System.out.println("Enter the quantity");
        quantity = sc.nextInt();
    }

    int calculatePriceOfBook() {
        return price * quantity;
    }

    public void purchaseBook() {
        System.out.println("Enter the name of book you want to purchase");
        Scanner sc = new Scanner(System.in);
        String bookName = sc.nextLine();
        if (bookName.equals(title)) {
            System.out.println("You want to purchase the book named " + bookName);
            System.out.println("We have only " + quantity + " books of " + title);

            System.out.println("Enter the quantity of books you want to purchase");
            int quantity1 = sc.nextInt();

            if (quantity < quantity1) {
                System.out.println("We have only " + quantity + " books of " + title);
            } else {
                int totalPrice = quantity1 * this.price;
                System.out.println("You purchased the book " + title + " for the price of " + totalPrice);

                quantity = quantity - quantity1;
            }
        } else {
            System.out.println("We don't have a book titled " + bookName);
        }
    }

    public void showStockQuantity() {
        System.out.println("We now have only " + quantity + " of books named " + title);
    }

    public void display() {
        System.out.println("Author of the book: " + author);
        System.out.println("Title of the book: " + title);
        System.out.println("Price of the book: " + price);
        System.out.println("Quantity of the book: " + quantity);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];
        int count = 0;

        System.out.println("Welcome to the Bookstore");

        while (true) {
            System.out.println("1. Create Book Information");
            System.out.println("2. Show the Quantity of the Stock");
            System.out.println("3. Purchase Book");
            System.out.println("4. Display the Book Information");
            System.out.println("5. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (count < books.length) {
                        books[count] = new Book();
                        books[count].scanData();
                        count++;
                    } else {
                        System.out.println("No more books can be added.");
                    }
                    break;
                case 2:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            books[i].showStockQuantity();
                        }
                    } else {
                        System.out.println("No books available.");
                    }
                    break;
                case 3:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            books[i].purchaseBook();
                        }
                    } else {
                        System.out.println("No books available to purchase.");
                    }
                    break;
                case 4:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            books[i].display();
                        }
                    } else {
                        System.out.println("No books available to display.");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}

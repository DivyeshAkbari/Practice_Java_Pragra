package src.InventoryManagementSystem;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) throws ProductNotFoundException {

        Scanner sc=new Scanner(System.in);
        ProductManager pm=new ProductManager();
        while(true)
        {
            System.out.println("Enter the number of which operation you want to perform");
            System.out.println("Inventory Management System");
            System.out.println("1.Adding");
            System.out.println("2.Remove");
            System.out.println("3.Update");
            System.out.println("4.View last 5 Products");
            System.out.println("5.Display All the products");
            System.out.println("6.exit");
            System.out.println("Enter the choice which you want to do");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter Product id");
                    int id=sc.nextInt();

                    System.out.println("Enter Product Name");
                    String name=sc.next();

                    System.out.println("Enter Product Price");
                    double price=sc.nextDouble();

                    System.out.println("Enter Product Quantity");
                    int quantity=sc.nextInt();

                    Product p1=new Product(id,name,price,quantity);
                    pm.add(p1);
                    pm.addRecentlyViewedProduct(p1);

                    break;
                case 2:
                    System.out.println("Enter the product id which you want to remove");
                    int product_id=sc.nextInt();
                    pm.removeProduct(product_id);
                    break;
                case 3:
                    System.out.println("Enter new Details of product which you want to update");
                    System.out.println("Enter Product id where you want to Update ");
                    int id2=sc.nextInt();

                    System.out.println("Enter Product Name");
                    String name2=sc.next();

                    System.out.println("Enter Product Price");
                    double price2=sc.nextDouble();

                    System.out.println("Enter Product Quantity");
                    int quantity2=sc.nextInt();

                    Product p2=new Product(id2,name2,price2,quantity2);
                    pm.updateProduct(p2);
                    break;
                case 4:
                    pm.displayRecentlyViewedProducts();
                    break;
                case 5:
                    pm.displayProduct();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
}

package src.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private List<Product> productList=new ArrayList<>();
    private LinkedList<Product> recentlyViewedProducts=new LinkedList<>();

    public void add(Product product)
    {
        if(product.getPrice() < 0)
        {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        productList.add(product);
    }
    public void removeProduct(int id) throws ProductNotFoundException {
        boolean found=false;

        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                found=true;
                break;
            }
        }
        if(found==true)
        {
            System.out.println("Product with this "+ id+" id Removed Successfully ");
            throw new ProductNotFoundException("Product can not be found By this id "+id);
        }
        else {
            throw new ProductNotFoundException("Product can not be found By this id "+id);
        }
    }

    public void updateProduct (Product updatedProduct) throws ProductNotFoundException
    {
        boolean found=false;
        for (Product p : productList)
        {
            if (p.getId() == updatedProduct.getId())
            {
                p.setName(updatedProduct.getName());
                p.setQuantity(updatedProduct.getQuantity());
                p.setPrice(updatedProduct.getPrice());
                found=true;
                break;
            }
        }

        if(found==true)
        {
            System.out.println("Product with this "+ updatedProduct.getId()+" id Updated Successfully ");
        }
        else {
            throw new ProductNotFoundException("Product can not be found By this id "+updatedProduct.getId());
        }
    }

    public void displayProduct()
    {
        System.out.println("All the product Display");
        for(Product p: productList)
        {
            System.out.println(p);
        }
    }

    public void addRecentlyViewedProduct(Product product)
    {
        if (recentlyViewedProducts.size() >= 5)
        {
            recentlyViewedProducts.removeFirst();
        }
        recentlyViewedProducts.add(product);
    }

    public void displayRecentlyViewedProducts()
    {
        System.out.println("Recently Viewed Products:");
        for (Product product : recentlyViewedProducts)
        {
            System.out.println(product);
        }
    }
}

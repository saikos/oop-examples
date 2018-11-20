package org.afdemp.cb6.ex01;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    
    private List<Product> products;
    private User owner;

    public Cart(User owner) {
        this.owner = owner;
        products   = new ArrayList<Product>();
    }

    public void add(Product p) {
        products.add(p);
    }

    public void remove(Product p) {
        products.remove(p);
    }

    public double getTotal() {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void checkout() {
        double total = getTotal();
        owner.withdraw(total);
        products.clear();
    }
}

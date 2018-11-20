package org.afdemp.cb6.ex01;

public class Product {

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id    = id;
        this.name  = name;
        setPrice(price);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

}

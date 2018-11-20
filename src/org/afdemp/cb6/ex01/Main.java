package org.afdemp.cb6.ex01;

public class Main {

    public static void main(String[] args) {
        User user = new User("username", "Name", "Surname");
        Cart cart = new Cart(user);
        cart.add(new Product("P001", "Mouse",    12.00));
        cart.add(new Product("P002", "Keyboard", 14.00));
        System.out.println("Total = " + cart.getTotal());
    }

}

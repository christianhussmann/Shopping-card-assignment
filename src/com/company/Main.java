package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        //her tilføjer vi varer til vores shoppingcart
        cart.addItem("Mælk");
        cart.addItem("Æble");
        cart.addItem("Pære");
        cart.addItem("Pære");
        cart.listItems();
        //og til sidst fjerner vi så et item fra vores shoppingcart, og viser vores liste af items igen
        cart.removeItem("Mælk");
        cart.listItems();
    }
}

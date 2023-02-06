package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    //En liste til at gemme vare i shoppingcarten
    private List<String> items;
    //En map til at gemme mængderne af hver vare i indkøbsvognen
    private Map<String, Integer> quantities;


    //Constructor til at initialisere vores items og quantities lister
    public ShoppingCart(){
        items = new ArrayList<>();
        quantities = new HashMap<>();
    }

    //Metode til at vise varene i shoppingcarten
    public void listItems(){
        //Her printer vi en overskrift for listen over varene i shoppingcarten
        System.out.println("I indkøbsvognen er der:");
        //Her looper vi igennem hver vare i vores items-liste
        for(String item : items){
            //Vi laver en sout af varen og dens mængde
            System.out.println(item + " x " + quantities.get(item));
        }
    }

    //Metode til at adde en vare til vores shoppingcart
    public void addItem(String item) {
        //tilføj varen til vores liste af items
        items.add(item);
        //her laver vi et if statement til hvis varen allerede er i vores
        // quantities map hvis den allerede er der, vil der blive tilføjet en mere.
        if(quantities.containsKey(item)){
            quantities.put(item, quantities.get(item) + 1);
        }
        //her har vi vores else som bliver udført hvis vores item IKKE er på vores quantities-map
        else{
            quantities.put(item, 1);
        }
    }

    //Metode til at remove items fra vores indkøbskurv
    public void removeItem(String item) {
        //Her laver vi en if-statement som bliver udført
        //hvis varen findes i vores items-liste
        if (items.contains(item)){
            //fjernelse af varen fra listen
            items.remove(item);
            //hvorefter vi fjerner den fra vores quantities-map
            quantities.remove(item);
        }
        //hvis varen ikke er i items-listen så har vi vores else som laver et print
        else{
            System.out.println("Varen er ikke i indkøbsvognen og kan derfor ikke fjernes.");
        }
    }

}

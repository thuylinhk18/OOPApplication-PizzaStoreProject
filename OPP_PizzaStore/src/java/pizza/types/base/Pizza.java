/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.types.base;

import java.util.List;
import pizza.ingredients.dough.DoughEnum;

/**
 *
 * @author bebet
 */
public abstract class Pizza {

    protected String name;
    protected DoughEnum dough;
    protected String sauce;
    protected List<String> toppings;

    public Pizza(String name, DoughEnum dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + " dough...");
        System.out.println("Adding " + sauce + " sauce...");
        System.out.println("Adding toppings: ");
        if (toppings != null) {
            for (String topping : toppings) {
                System.out.println(topping + " ");
            }
        }
    }

    public void bake() {
        System.out.println("Baking " + name + " in 30mins");
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

}

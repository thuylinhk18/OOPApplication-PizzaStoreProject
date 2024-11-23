/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.types.Hue;

import pizza.types.base.Pizza;
import java.util.ArrayList;
import java.util.List;
import pizza.ingredients.topping.CheeseTopping;
import pizza.ingredients.dough.DoughEnum;
import pizza.ingredients.sauce.PepperSauce;

/**
 *
 * @author bebet
 */
public class HueGreekPizza extends Pizza {

    public HueGreekPizza() {
        super("Hue The best Greek Pizza",
                DoughEnum.THICK,
                "Hue" + new PepperSauce().getSauce(),
                createDefaultToppings());
    }

    private static List<String> createDefaultToppings() {
        List<String> toppings = new ArrayList<>();
        toppings.add(new CheeseTopping().getTopping());
        return toppings;
    }

    @Override
    public void bake() {
        System.out.println("Bake at 150C for 10 minutes.");
    }

}
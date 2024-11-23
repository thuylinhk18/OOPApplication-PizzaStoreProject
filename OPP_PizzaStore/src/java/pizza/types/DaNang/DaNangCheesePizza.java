/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.types.DaNang;

import pizza.types.Hue.*;
import pizza.types.base.Pizza;
import java.util.ArrayList;
import java.util.List;
import pizza.ingredients.topping.CheeseTopping;
import pizza.ingredients.dough.DoughEnum;
import pizza.ingredients.topping.MushroomTopping;
import pizza.ingredients.sauce.TomatoSauce;

/**
 *
 * @author bebet
 */
public class DaNangCheesePizza extends Pizza {

    public DaNangCheesePizza() {
        super(
                "Da Nang Cheese Pizza",
                DoughEnum.THIN,
                "Da Nang" + new TomatoSauce().getSauce(),
                createDefaulToppings()
        );
    }

    private static List<String> createDefaulToppings() {
        List<String> toppings = new ArrayList<>();
        toppings.add(new MushroomTopping().getTopping());
        toppings.add(new CheeseTopping().getTopping());
        return toppings;
    }

    @Override
    public void bake() {
        System.out.println("Bake at 200C for 20 minutes");
    }

}

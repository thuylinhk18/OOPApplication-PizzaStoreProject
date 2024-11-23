/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.store;

import pizza.types.Hue.HueCheesePizza;
import pizza.types.Hue.HueGreekPizza;
import pizza.types.base.Pizza;

/**
 *
 * @author bebet
 */
public class HuePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String typePizza) {
        switch (typePizza) {
            case "cheese" -> {
                return new HueCheesePizza();
            }
            case "greek" -> {
                return new HueGreekPizza();
            }
            default -> {
                System.out.println("We do not have " + typePizza + " pizza");
                return null;
            }
        }
    }

}

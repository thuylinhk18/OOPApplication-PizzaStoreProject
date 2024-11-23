/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.store;

import pizza.types.HCM.HCMCheesePizza;
import pizza.types.HCM.HCMGreekPizza;
import pizza.types.base.Pizza;

/**
 *
 * @author bebet
 */
public class HCMPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String typePizza) {
        switch (typePizza) {
            case "cheese" -> {
                return new HCMCheesePizza();
            }
            case "greek" -> {
                return new HCMGreekPizza();
            }
            default -> {
                System.out.println("We do not have " + typePizza + " pizza");
                return null;
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.store;

import pizza.types.base.Pizza;
import pizza.types.Hue.HueCheesePizza;
import pizza.types.Hue.HueGreekPizza;

/**
 *
 * @author bebet
 */
public abstract class PizzaStore {

    public void orderPizza(String typePizza) {
        Pizza pizza;
        pizza = createPizza(typePizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    protected abstract Pizza createPizza(String typePizza);
}

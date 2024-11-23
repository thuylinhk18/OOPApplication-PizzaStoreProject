
import pizza.store.DaNangPizzaStore;
import pizza.store.HCMPizzaStore;
import pizza.store.PizzaStore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bebet
 */
 public class Main {
    public static void main(String[] args) {
        HCMPizzaStore pizzaStore = new HCMPizzaStore();
        pizzaStore.orderPizza("cheese");
        System.out.println("-------------------");
        DaNangPizzaStore dnPizzaStore = new DaNangPizzaStore();
        dnPizzaStore.orderPizza("cheese");
        System.out.println("--------------------");
      
    }
}

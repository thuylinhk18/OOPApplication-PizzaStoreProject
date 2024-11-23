/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.ingredients.sauce;

/**
 *
 * @author bebet
 */
public class CustomerSauce extends Sauce{
 private String nameSauce;

    public CustomerSauce(String nameSauce) {
        this.nameSauce = nameSauce;
    }

    public String getNameSauce() {
        return nameSauce;
    }

    public void setNameSauce(String nameSauce) {
        this.nameSauce = nameSauce;
    }
 
    @Override
    public String getSauce() {
        return nameSauce;
    }
    
}

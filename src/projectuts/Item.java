/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuts;

import java.io.Serializable;
/**
 *
 * @author Andri
 */
public class Item implements Serializable{
    String name;
    String color;
    int qty;
    String category;
    
    public Item(String name, String color, int qty, String category){
        this.name = name;
        this.color = color;
        this.qty = qty;
        this.category = category;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getQty(){
        return qty;
    }
    public String getCategory(){
        return category;
    }
    
}

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
public class item implements Serializable{
    String name;
    String color;
    int qty;
    String category;
    
    public item(String name, String color, int qty, String category){
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
    public String setName(){
        return name;
    }
    public String setColor(){
        return color;
    }
    public int setQty(){
        return qty;
    }
    public String setCategory(){
        return category;
    }
    
}

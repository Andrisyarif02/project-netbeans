package projectuts;

import java.io.Serializable;

/**
 * @author User
 */
public class Item implements Serializable{
    private String name;
    private String color;
    private int qty;
    private String category;
    private int price;

    Item(String name, String color, int qty, int price, String category){
        this.name = name;
        this.color = color;
        this.qty = qty;
        this.price = price;
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
    
    public void setPrice(int price){
        this.price = price;
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
    
    public int getPrice(){
        return price;
    }
}

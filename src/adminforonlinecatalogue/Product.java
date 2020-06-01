/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminforonlinecatalogue;

/**
 *
 * @author charles
 */
public abstract class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    private String category;
    
    public Product(int pid, String pname, float pprice, String pAddDate, byte[] pimg, String category){
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
        this.picture = pimg;
        this.category =  category;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String getaddDate(){
        return addDate;
    }
    
    public byte[] getImage(){
        return picture;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setPrice(float price){
        this.price=price;
    }
    
    public void setaddDate(String date){
        this.addDate = date;
    }
    
    public void setImage(byte[] img){
        this.picture = img;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public abstract String getLaces();
    public abstract String getType();
    public abstract void setLaces(String laces);
    public abstract void setType(String type);
}

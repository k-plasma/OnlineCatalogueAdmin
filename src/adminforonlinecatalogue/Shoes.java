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
public class Shoes extends Product {
    private String Laces;
    
    public Shoes(int pid, String pname, float pprice, String pAddDate, byte[] pimg, String category, String laces){
        super(pid,pname,pprice,pAddDate,pimg,category);
        this.Laces = laces;
    }
    
    public String getLaces()
    {
        return Laces;
    }
    
    public String getType() {
        return null;
    }

    public void setLaces(String laces) {
        this.Laces = laces;
    }

    public void setType(String type) {
      
    }
}

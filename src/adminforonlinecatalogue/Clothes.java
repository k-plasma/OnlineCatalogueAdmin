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
public class Clothes extends Product {
    
    private String Type;
    
    public Clothes(int pid, String pname, float pprice, String pAddDate, byte[] pimg, String category, String type){
        super(pid,pname,pprice,pAddDate,pimg,category);
        this.Type=type;
    }
    
    public String getType()
    {
        return Type;
    }

    public String getLaces() {
        return null;
    }
    
    public void setLaces(String laces) {
        
    }

    public void setType(String type) {
        this.Type = type;
    }
    
}

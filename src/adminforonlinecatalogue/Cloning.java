/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminforonlinecatalogue;
import java.util.ArrayList;

/**
 *
 * @author charles
 */
public class Cloning implements Cloneable {
    ArrayList<Product> MyList;
    
    public Cloning(ArrayList<Product> A)
    {
        this.MyList = A;
    }
    
    
    public ArrayList<Product> clone() {
         ArrayList<Product> cloneList = new ArrayList<Product>();
      try {
        
         cloneList = (ArrayList<Product>)MyList.clone();
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return cloneList;
    }
    
}

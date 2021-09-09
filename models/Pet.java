/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petadoption;

/**
 *
 * @author Saeed
 */
public class Pet {
    int ID;
    String name;
    int type;
    int age;
    boolean adopted;
    
    Pet(){
        
    }
  
    Pet(String name, int type, int age, boolean adopted){
        this.name = name;
        this.type=type;
        this.age=age;
        this.adopted= adopted;
        
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getType(){
        return this.type;
    }
    public void setType(int ty){
       this.type=ty;
       
    }
     public void setAge(int ty){
       this.age=ty;
       
    }
     public int getAge(){
         
         return this.age;
     }
     public boolean isAdopted(){
         return this.adopted;
     }
    
    
    
}

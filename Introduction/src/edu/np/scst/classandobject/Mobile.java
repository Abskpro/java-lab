
package edu.np.scst.classandobject;

public class Mobile{
    String modelNo;
    float ram;
    boolean isWifi;
    
    Mobile(){ //constructor must have same name as class name
        System.out.println("A mobile is made");
    }
    
    public void ring(){
        System.out.println("tring tring");
    }
    
    public Mobile(String modelNo, float ram){
        this.modelNo = modelNo;
        this.ram = ram;
        this.isWifi = isWifi;
    }
}
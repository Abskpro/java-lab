package edu.np.scst.constructors;

public class Mobile{
    Mobile(){
        this(10);
        System.out.println("hello");
    }
    
    Mobile(int i){
        System.out.println("hello again"+i);
    }
    
    Mobile(double j){
        System.out.println("Hello hello again"+j);
    }
    
    public static void main (String[] args){
        Mobile mobile = new Mobile();
    }
}

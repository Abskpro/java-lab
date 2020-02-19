
package edu.np.scst.inheritance.multilevel;
public class Child extends Parent{
    int money3 = 300;
    public static void main(String[] args){
        Child c = new Child();
        System.out.println(c.money1);//grand parents property 
        System.out.println(c.money2);//parent's property
        System.out.println(c.money3);//self property
    }
}

package edu.np.scst.inheritance.single;
public class Child extends Parent{
    int money2 = 200;
    public static void main(String[] args) {
        Child c = new Child();//object creation
        System.out.println(c.money);//100
        System.out.println(c.money2);//200
        System.out.println(c.eye);//black
        c.car();//caling a method in the parent class
        Parent p  = new Parent();
        System.out.println(p.money);
//      System.out.println(p.money2);//parent cannot inherit from child
        c.calc(9);
    }
}

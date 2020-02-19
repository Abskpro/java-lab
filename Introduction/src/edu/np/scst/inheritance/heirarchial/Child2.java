package edu.np.scst.inheritance.heirarchial;

public class Child2 extends Parent{
    int moneyC2 = 300;
    public static void main(String[] args){
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        System.out.println(c1.moneyC1);//
        System.out.println(c2.moneyC2);
        Parent p = new Child1(); //polymorphism child ko bata parent 
        System.out.println(p.money);
    }
}
package edu.np.scst.classandobject;

public class Factory{
    public static void main(String[] arg){
        Laptop hp = new Laptop();
        hp.modelNo = "abc123";
        hp.ram = 32;
        System.out.println("model no"+ hp.modelNo);
        System.out.println("ram"+ hp.ram);
        System.out.println("is Hd"+ hp.isHD);
        hp.display();
        System.out.println("is Hd"+hp.isHD);
    }
}
package edu.np.scst.classandobject;

public class AssemblyLine{
    public static void main(String[] arg){
        Mobile redmi = new Mobile();
        redmi.modelNo="xyz";
        redmi.ram=4.5f;
        System.out.println("Model no:"+ redmi.modelNo);
        System.out.println("Ram:"+redmi.ram);
        System.out.println("Wifi aviablable"+redmi.isWifi);
        redmi.ring();
        
    }
}


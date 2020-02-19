package edu.np.scst.instancestatoc;

public class InstanceStatic{
    public void instance1(){
        instance2();//calling instance from instance
        System.out.println("instance 1");
}
    public void instance2(){
        InstanceStatic.static1();//calling static from instance
        System.out.println("instance 2");
    }
    
    public static void static1(){
        System.out.println("static 1");
    }
    
    public static void main(String[] args){
        static1();//calling static for static
        InstanceStatic obj = new InstanceStatic();
        obj.instance1();//calling instance from static
    }
}


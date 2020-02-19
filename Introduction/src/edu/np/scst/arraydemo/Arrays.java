
package edu.np.scst.arraydemo;

import jdk.nashorn.internal.objects.NativeArray;

public class Arrays{
    public static void main(String[] args) {
        int[] i = new int[5];//prefferable
        int j[] = new int[5];
        boolean[] b = new boolean[5];
        int [] k = {1,1,2,3};
        int q=5;
        for (int counter = 0; counter < i.length ; counter++) {
            System.out.println(i[counter]);
        }
        for(boolean var: b){//for each loop
            System.out.println(var);
        }
        do{
            System.out.println("hello");
            q--;
        }while(q>3);
        
        while(q>2){
            System.out.println("yello");
            q--;
        }
    }
}
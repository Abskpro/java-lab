package edu.np.scst.lab11;

public class Array{
    public static void main(String[] args){
        int k=1;
        float [] arr = new float[10];
        for(int j=0;j<=9;j++){
            arr[j] = k;
            k++;
        }
        for(float var:arr){//take each value from arr and store in var and displays 
                    System.out.println(var);
        }
    }`
}

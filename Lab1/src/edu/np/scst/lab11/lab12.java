package edu.np.scst.lab11;
public class lab12 {
      public static void main(String[] args){
           int num = 25;
           int i;
           int count = 0;
            for (i=1;i<=num;i++){
                if(num % i == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.println("it is prime");
            }else{
                System.out.println("it is not prime");
            }
      }
}


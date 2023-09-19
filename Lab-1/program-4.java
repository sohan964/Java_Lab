
package javaapplication1;

import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sqt = (int) Math.sqrt(n);
         boolean f1 = true;
         for(int i=2;i<=sqt;i++){
             if(n%i==0){
                 f1 = false;
                 break;
             }
         }
         if(f1) System.out.println("Prime");
         else System.out.println("not Prime");
         
    }
    
}

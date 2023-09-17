
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    
    public static void main(String[] args) {
        int n=5;
        int []arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) arr[i]= sc.nextInt();
        boolean swapped;
        for ( int i = 0; i < n - 1; i++) {
        swapped = false;
        for ( int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                   var temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
            }
        }
  
        
        if (swapped == false)
            break;
    }
        for(var u:arr) System.out.print(u+ " ");
        System.out.println();
        
    }
    
}

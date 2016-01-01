import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Temp {
    
    

    public static void insertIntoSorted(int[] ar) {
    
        int a[] = ar;
        int temp=0;
    
        if((1<=a.length) && (a.length<=1000))
        {
            temp=a[a.length-1];
            if(a[a.length-1] < a[a.length-2])
            {
                for(int i=0; i<a.length-1; i++)
                {
                    
                    if(a[a.length-2-i] >=temp)
                    {
                        a[a.length-1-i] = a[a.length-2-i];
                        printArray(a);
                    }
                    if(a[a.length-2-i]<temp)
                    {
                        a[a.length-1-i]=temp;
                        printArray(a);
                        break;
                    }
                }
                if(temp<a[0]){
                    a[0]=temp;
                    printArray(a);
                }
            }
            
            else
            {
                printArray(a);
            }
        }
    }

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         BigInteger fact = BigInteger.valueOf(1);
        
        if((1<=n) && (n<=100)){
            
            for(int i = n; i >0; i--) {
               fact= fact.multiply(BigInteger.valueOf(i)); 
                }
        } 
      
        System.out.print(fact);
        
         }
    
}
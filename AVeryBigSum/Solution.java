import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static long sum=0; 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       String length = sc.nextLine();
        String input = sc.nextLine();
        String delim = " ";
        
        StringTokenizer st  = new StringTokenizer(input,delim);
         int count = st.countTokens();

         if(1<=count && count<=10){  
            int[] a = new int[count];
         
            while(st.hasMoreTokens()){
                sum +=Long.parseLong((String)st.nextToken());
            }

        }
        System.out.print(sum);

       }
    
}
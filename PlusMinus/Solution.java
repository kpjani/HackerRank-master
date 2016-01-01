import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        int temp=0;
        float p=0,n=0,z=0;
        if((length>=1) && (length<=100)){
            for(int i=0;i<length;i++){
                temp=sc.nextInt();
                if((temp>=-100) && (temp<=100) )
                {
                    if(temp<0) n++;
                    else if(temp>0) p++;                    
                    else   z++;
               }
            } 
            
            System.out.println(String.format("%.3f", (p/length)));
            System.out.println(String.format("%.3f", (n/length)));
            System.out.println(String.format("%.3f", (z/length)));
            
        }
    }
}
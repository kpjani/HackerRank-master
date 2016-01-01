import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if((n>=1) && (n<=100)){
            for(int i=1;i<=n;i++){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }
                for(int j=i;j>0;j--){
                    System.out.print("#");
                }
               
                System.out.println();
            }
            
        }
    }
}
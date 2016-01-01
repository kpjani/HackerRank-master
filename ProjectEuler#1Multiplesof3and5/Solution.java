
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
                
        long d3=3, d5=5, d15=15;
        long n3=0,n5=0,n15=0;
        if((1<=T) && (T<=100000))
        {   
            for(int j=0; j<T; j++)
            {
                long    sum3=0,sum5=0,sum15=0,sum=0;
                long l3,l5,l15=0;
                
                int N = sc.nextInt();
                if((1<=N) && (N<=1000000000))
                {
                    N=N-1;
                    l3 = N%3;
                    l3 = N - l3;
                    n3 = (l3-3)/3 + 1;
                    sum3 = (3*((n3)+1)*(n3))/2;
                                
                    l5 = N%5;
                    l5 = N - l5;
                    n5 = (l5-5)/5 + 1;
                    sum5 = (5*((n5)+1)*(n5))/2;
                    
                    l15 = N%15;
                    l15 = N - l15;
                    n15 = (l15-15)/15 + 1;
                    sum15 = (15*((n15)+1)*(n15))/2;
                    
                    sum=sum3 + sum5 - sum15;
                    System.out.println(sum);
                }
            }
        }
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if((1<=N) && (N<=1000))
        {   
            BigInteger temp= sc.nextBigInteger();
            BigInteger sum = new BigInteger("0");
            sum = sum.add(temp); 
            for(int k=1;k<N;k++)
            {
                temp = sc.nextBigInteger();
                sum = sum.add(temp);
            }
            String ans= sum.toString();
            System.out.print(ans.substring(0,10));
        }
    }
}
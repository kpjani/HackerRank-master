
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
       
        if((1<=T) && (T<=10))
        {   
            for(int k=0;k<T;k++)
            {
                long N = sc.nextLong();
                if((1<=N) && (N< Long.MAX_VALUE) )
                {
                    int i;
                    for (i = 2; i <= Math.sqrt(N); i++) {
                        if (N % i == 0) {
                            N /= i;
                            i--;
                        }
                    }
                    System.out.println(N);
                }
            }
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
       
        if((1<=T) && (T<=10000))
        {   
            for(int k=0;k<T;k++)
            {
                long SumofSquares=0, SquareofSums=0, answer=0;
                long N = sc.nextLong();
                if((1<=N) && (N<= 10000) )
                {
                    answer = (((3*N*N*N*N) + (2*N*N*N) - (3*N*N) - (2*N)))/12;
                    System.out.println(answer);
                }
            }
        }
    }
}

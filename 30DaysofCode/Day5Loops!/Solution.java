import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            int result=a;
            for (int j = 0; j < N; j++) {
                result +=((int)Math.pow(2, j)*b);
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
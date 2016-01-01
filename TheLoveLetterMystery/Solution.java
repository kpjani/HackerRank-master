import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        int result = 0;
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        String str;
        for (int i = 0; i < n; i++) {
            result=0;
            str = sc.next();
        
            boolean flag = checkPal(str);
            if(flag)
            {
                System.out.println(result);
            }
            else
            {
                result= makePal(str);
                System.out.println(result);
            }
        }
    }
    
    public static boolean checkPal(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    
    public static int makePal(String s)
    {
        int l = s.length();
        int diff =0 ;
        
        for (int i = 0; i < l/2; i++) {
            diff += Math.abs((int)s.charAt(i) -(int)s.charAt(l-i-1));
        }
        return diff;
    }
}
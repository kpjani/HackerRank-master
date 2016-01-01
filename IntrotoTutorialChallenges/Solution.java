import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int search=sc.nextInt();
        int n=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++)
        {
            temp=sc.nextInt();
            if(temp==search)
            {
                System.out.print(i);
                break;
            }
        }
        
    }
}
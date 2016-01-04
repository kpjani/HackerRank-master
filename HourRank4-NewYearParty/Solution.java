import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        for(int i=0; i < n; i++){
            t[i] = in.nextInt();
        }
        
        int gap=0, back=0, time=t[0];
       
        for (int i = 1; i < t.length; i++)
        {
            if(t[i] == t[i-1])
            {
                back++;
            }
            if(t[i]> t[i-1]+1)
            {
                gap=t[i]-t[i-1]-1;
                while((back>0) && (gap>0))
                {
                    back--;
                    gap--;
                }
            }       
        }
        time = t[n-1]+back;
        System.out.println(time);
    }
}

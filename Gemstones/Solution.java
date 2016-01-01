import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int[][] a;
        a=new int[t][26];
        for(int i=0;i<t;i++){
            String s=in.next();
            char[] b=s.toCharArray();
             for(int j=0;j<b.length;j++){
                a[i][b[j]-'a']++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            int z=0;
            for(int j=0;j<t;j++){
                      if(a[j][i]==0){
                          z=1;
                          break;
                      }
            }
            if(z==0)
                count++;
        }
        System.out.print(count);
    }
}
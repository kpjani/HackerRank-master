import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if (0<= x  && x<=999)
                    {   
                    String x1 =""+ x;
                    int length =x1.length();
                    if(length==1){ 
                        x1="00"+x;
                    }
                    if(length==2){ 
                        x1="0"+x;
                    }
                    for(int k=s1.length()+1; k<=15; k++)
                        {
                        s1=s1+" ";
                    }
                    System.out.print(s1);
                    System.out.print(x1);
                }
              System.out.println();
            }
            System.out.println("================================");

    }
}
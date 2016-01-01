import java.io.*; 
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int hh,mm,ss;
        String t;
        t=br.readLine();
        hh=   Integer.parseInt(t.substring(0,2));
        mm=   Integer.parseInt(t.substring(3,5));
        ss=   Integer.parseInt(t.substring(6,8));
        String temp=t.substring(8,10);
        
        if((0<=hh) && (hh<=12) && ((0<=mm) && (mm<=59)) && ((0<=ss) && (ss<=59)) && (t.substring(8,10).equalsIgnoreCase("PM"))){
            if(hh < 12)
            {
                hh =hh+12;
            } 
            
            String m = (mm < 10 ? "0" : "") + mm; 
            String s = (ss < 10 ? "0" : "") + ss;
            String h = (hh < 10 ? "0" : "") + hh;
            System.out.print(h+":"+m+":"+s);
            
        }else if((0<=hh) && (hh<=12) && ((0<=mm) && (mm<=59)) && ((0<=ss) && (ss<=59)) && (t.substring(8,10).equalsIgnoreCase("AM"))){
           if(hh == 12)
            {
                hh =0;
            }
            String m = (mm < 10 ? "0" : "") + mm;
            String s = (ss < 10 ? "0" : "") + ss;
            String h = (hh < 10 ? "0" : "") + hh; 
            System.out.print(h+":"+m+":"+s);
        }
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc= new Scanner(System.in);
        int rd=sc.nextInt();
        int rm=sc.nextInt();
        int ry=sc.nextInt();
        
        int dd=sc.nextInt();
        int dm=sc.nextInt();
        int dy=sc.nextInt();
        
        String returnd=""+ry+"-"+rm+"-"+rd;
        String due=""+dy+"-"+dm+"-"+dd; 
        long fine=0; 
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date returndate = sdf.parse(returnd);
        Date duedate = sdf.parse(due);
       
        
        if(returndate.after(duedate)){
              
                if(returndate.getYear() != duedate.getYear()) 
                {
                    fine =10000;
                   
                }
                else 
                {
                   
                    if( returndate.getMonth() != duedate.getMonth()) 
                    {
                     
                        long diff = Math.abs(returndate.getTime() - duedate.getTime());
                        long diffDays = diff / ( 24 * 60 * 60 * 1000);
                        long diffMonths = diffDays / 30;
                        fine = diffMonths * 500;
                        
                    }
                    else
                    {
                       
                       long diff = Math.abs(returndate.getTime() - duedate.getTime());
                       long diffDays = diff / (24 * 60 * 60 * 1000);
                       fine = diffDays * 15;
                        
                    }
                }
            }
        else{ 
            fine=0;
        }
            System.out.print(fine);
        }
    
}
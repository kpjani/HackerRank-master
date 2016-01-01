import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Matrix1 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0, leftD=0, rightD=0; 
        
        for(int j = 0; j < n; j++){
             for(int k = 0; k < n; k++){
                 temp = sc.nextInt();
                 if(j == k){
                    leftD += temp;
                 }
                    if(j+k == (n-1)){
                rightD += temp;
        }
    }
}

        System.out.print(Math.abs(leftD-rightD));
    }
}
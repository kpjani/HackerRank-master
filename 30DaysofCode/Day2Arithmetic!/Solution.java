import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      double tip = (M*T)/100.0;
      double tax = (X*M)/100.0;
      double cost = M + tip + tax;
        
      int total = (int) Math.round(cost);
      System.out.println("The final price of the meal is $"+total+".");
    }
}

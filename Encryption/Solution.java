import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(encrypt(s));
    }
    
    public static String encrypt(String s)
    {
        double length = s.length();
        int row =(int) Math.floor(Math.sqrt(length));
        int col =(int) Math.ceil(Math.sqrt(length));
        if(row*col <length)
        {
            row++;
        }
        char c[] = s.toCharArray();
        char arr[][]= new char[row][col];
        char trans[][]= new char[col][row];
        int curr=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (curr<c.length) {
                    arr[i][j]= c[curr];
                    curr++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i]=arr[i][j];
            }
        }
        count=0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if ((count<length) && (trans[i][j]!=(char) 0)) {
                    sb.append(trans[i][j]);
                    count++;
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
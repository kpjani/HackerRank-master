import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   protected String firstName;
   protected String lastName;
   int phone;
   Student(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;
       
   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
   }

}
class Grade extends Student{
   private int score;
   public Grade(String firstName, String lastName, int phone, int score) {
        super(firstName, lastName, phone);
        this.score = score;
   }
    
    public char calculate() {
        if ( this.score < 40 ) return 'D';
        else if ( this.score >= 40 && this.score < 60 ) return 'B';
        else if ( this.score >= 60 && this.score < 75 ) return 'A';
        else if ( this.score >= 75 && this.score < 90 ) return 'E';
        else return 'O';
}
   
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());
        
    }
}
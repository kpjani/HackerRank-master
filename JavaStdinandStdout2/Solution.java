import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            Double y=sc.nextDouble();
            String s = "";
                 while (sc.hasNextLine()) {
                    s += sc.nextLine();
                 }
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}

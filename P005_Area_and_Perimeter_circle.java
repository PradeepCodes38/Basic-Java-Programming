import java.util.Scanner;
//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
public class P005_Qs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius=sc.nextInt();
        System.out.println("the area of circle is "+ (2*3.14*radius*radius));
    }
}

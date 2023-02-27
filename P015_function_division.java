import java.util.Scanner;

public class P015_function_division {
    public static int div(int a, int b){
    int divi=a/b;
    return divi;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of a:");
    int a=sc.nextInt();
    System.out.println("enter the value of b:");
    int b=sc.nextInt();

    int divi=div(a, b);
    System.out.println("the division of a and b is "+ divi);
}
}

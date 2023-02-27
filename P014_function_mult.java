import java.util.Scanner;

public class P014_function_mult {
    public static int multiply(int a, int b) {
        System.out.println("the multiply of two number is ");
        int mult = a * b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=sc.nextInt();
        System.out.println("enter the value of b :");
        int b=sc.nextInt();
        
        int mult=multiply(a, b);
        System.out.println("the multiply od the given number is"+ mult);
    }
}

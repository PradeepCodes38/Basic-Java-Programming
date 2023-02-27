import java.util.Scanner;

public class P012_function {
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();


    }
    void putdata(){
        System.out.println("the sum of the two number is "+(a+b));
    }
    public static void main(String[] args) {
        P012_function nc=new P012_function();
        nc.getdata();
        nc.putdata();
            
        }
    }


import java.util.Scanner;


public class P013_function_additon {
   public static int calcu(int a, int b){//method defining
int sum=a+b;
return sum;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
 int sum=calcu(a, b);//method calling
 System.out.println(sum);
    }
}
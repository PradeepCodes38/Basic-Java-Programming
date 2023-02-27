import java.util.Scanner;



public class P035_recursion_fibo {
    public static void main(String[] args) {
        P035_recursion_fibo obj=new P035_recursion_fibo();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of nth :");
        int n=sc.nextInt();
        int original=obj.fib(n);
        System.out.println("the fibonacci of the term is:"+original);
    }
    
    int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        
        else{
            return fib(n-1)+fib(n-2);


        }

    }
}



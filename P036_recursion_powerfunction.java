import java.util.Scanner;

public class P036_recursion_powerfunction {
    public static void main(String[] args) {
        P036_recursion_powerfunction obj=new P036_recursion_powerfunction();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base:");
        int base=sc.nextInt();
        System.out.println("enter the value of raisedPower:");
        int raisedPower=sc.nextInt();
        int real=obj.pow(base,raisedPower);
        System.out.println("the answer of given problem is :"+real);
        
    }
    int pow(int base,int raisedPower){
        if(raisedPower==0){
            return 1;
        }
        else{
            return base*pow(base,raisedPower-1);
        }
    }
}

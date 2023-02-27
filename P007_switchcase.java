import java.util.Scanner;

public class P007_switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        System.out.print("enter the value of b:");
        int b=sc.nextInt();
        System.out.println("enter your choice:");
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div5.\nExit");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("the addition of two a and b is"+  (a+b));
            break;
            case 2:
            System.out.println("the sub of two a and b is"+  (a-b));
            break;
            case 3:
            System.out.println("the mul of two a and b is"+  (a*b));
            break;
            case 4:
            System.out.println("the div of two a and b is"+  (a/b));
            break;
            default:
            System.out.println("exit");
        }
    }
}

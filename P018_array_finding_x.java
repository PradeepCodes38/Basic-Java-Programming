import java.util.Scanner;

public class P018_array_finding_x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int size=sc.nextInt();
        int roll[]=new int[size];
        System.out.print("enter the value of an array:");
        for(int i=0;i<size;i++){
            roll[i]=sc.nextInt();
        }
        System.out.print("enter the number that index value you want to print :");
        int x=sc.nextInt();
        for(int i=0;i<roll.length;i++){
            if(roll[i]==x)
        System.out.println("the value of x is in index"+" "+ i);
        }
        
    }
}
 
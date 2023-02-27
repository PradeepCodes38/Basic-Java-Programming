import java.util.Scanner;

public class P011_table {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int a =sc.nextInt();
    for(int i=1;i<=10;i++){
    System.out.println("5x"+(i)+"="+(a*i));
    }
  }

}

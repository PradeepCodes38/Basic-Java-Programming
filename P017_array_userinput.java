import java.util.Scanner;

public class P017_array_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// new object creation
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();// user input for array size
        int roll[] = new int[size];// array defining

        System.out.println("enter the value of array:");
        for (int i = 0; i < size; i++) {
            roll[i] = sc.nextInt();

        }
        System.out.println("the value of array is");
        for (int i = 0; i < size; i++) {
            System.out.println(roll[i]);// printing of all array using loop
        }

    }
}

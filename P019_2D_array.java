import java.util.Scanner;



public class P019_2D_array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of row:");
        int row=sc.nextInt();
        System.out.println("enter the no. of column:");
        int column=sc.nextInt();
        int[][] numbers=new int [row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
            numbers[i][j]=sc.nextInt();
           
        }
    }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
            System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
    }
    
}
}

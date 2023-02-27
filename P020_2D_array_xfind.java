import java.util.*;
public class P020_2D_array_xfind {
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
    System.out.println("enter the value where you index wants to find:");
    int x=sc.nextInt();
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if(numbers[i][j]==x)
            System.out.print("the index of x is"+ " "+i+","+j);
            }
            System.out.println();
    }
    
}
}
   


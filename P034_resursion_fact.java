import java.util.*;;
public class P034_resursion_fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        P034_resursion_fact obj=new P034_resursion_fact(); //object creating
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
       
        int s=obj.fact(n);// using obj call function
        System.out.println(s);

    }
    int fact (int n){ //function
        if (n==1){
            return 1; //base condition
        }
        else{
            return n*fact(n-1);//recursion function
        }
    }
}

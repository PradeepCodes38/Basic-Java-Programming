public class P031_recursion1 {
    public static void printNumber(int n){
        if (n==0){  //base case
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);// recursion function
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n); ///call function
    }
}

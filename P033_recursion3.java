public class P033_recursion3 {
public static void printNum(int i,int n,int sum) {
    if (i==n){
        sum=sum+i;
        System.out.print(sum);
        return;
    }
    sum=sum+i;
    printNum(i+1, n, sum);
}
    public static void main(String[] args) {
        printNum(1, 5, 0);
    }
    
}

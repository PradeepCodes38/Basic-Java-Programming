//tower of hanoi
public class P037_recursion_towerOfHanoi {
    public static void main(String[] args) {
        int n =2;
        towerOfHanoi(n, "S", "H", "D");//calling function

    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println(" disk transfered " + n + " from " + source + " to " + destination);
            return;//base case
        }
        towerOfHanoi(n - 1, source, destination, helper);//recursion function
        System.out.println(" disk transfered " + n + " from " + source + " to " + destination);//if n=1 then directly transfer to destination
        towerOfHanoi(n - 1, helper, source, destination);

    }
}
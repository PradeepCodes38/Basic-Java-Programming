public class P016_array {
    public static void main(String[] args) {
        int[] roll =new int[4];
        roll[0]=76;
        roll[1]=62;
        roll[2]=38;
        roll[3]=37;
       // System.out.println(roll[0]);
       // System.out.println(roll[1]);
       // System.out.println(roll[2]);
       // System.out.println(roll[3]);
// using for loop
for(int i=0;i<4;i++){
    System.out.println(roll[i]);
}
// using of 2nd method of array defining:
    int rolls[]={76,62,38,37};
    for(int i=0;i<4;i++){
        System.out.println(rolls[i]);
    }
    }
}

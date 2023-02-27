public class P026_setbits {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        int newnumber=bitMask | n;
        System.out.println(newnumber);
    }
}

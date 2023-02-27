public class P027_clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        int newnumber=notBitMask & n;
        System.out.println(newnumber);
    }
}





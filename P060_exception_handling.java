
                                     ////****Exception Handling****////
class exce {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 20, b = 0, c;
        try {
            c = a / b; //// here exception is arithemetic if we want to handle it so we use try and
                       //// catch block
            // System.out.println(c);

        } catch (Exception re) {
            System.out.println(re);// agar humko pata krna hai ki kis type ka error aa rha hai to humlog reference
                                   // ko print kra denge.
        }
        System.out.println("end hello");

    }
}
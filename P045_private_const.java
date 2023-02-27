                 ///private constructor///
public class P045_private_const {
    int a;String b;
     private P045_private_const()
    {
a=10;b="name";

    }
    void show()
    {
        System.out.println(a+ " " +b);
    }
    public static void main(String[] args) {
        P045_private_const obj1=new P045_private_const();
        obj1.show();
    }
}

                ///by using other class/// we get error

/*class pc{
    public static void main(String[] args) {
        P045_private_const obj=new P045_private_const();
        obj.show();
    }
}
*/
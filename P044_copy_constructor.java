                  ///copy constriuctor////
public class P044_copy_constructor {
    int a,b;
    P044_copy_constructor(int x,int y)
    {
        a=x;b=y;
        System.out.println(a+" "+b);
    }
    P044_copy_constructor(P044_copy_constructor ref)//using copy constructor
    {
        a=ref.a;//using ref we assign the value of a into a
        b=ref.b;//using ref we assign the value of b into b
        System.out.println(a+" "+b);
    }
}
class cc{
public static void main(String[] args) {
    P044_copy_constructor obj=new P044_copy_constructor(20,40);
    P044_copy_constructor obj2=new P044_copy_constructor(obj);//transfer the obj1 value to the obj2 
}
}
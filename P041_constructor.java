                            /* Java constructor */

 class A {
    int a;String name;//instance variable
     A()
    {
a=10;name="mahi";
    }
        void show()
        {
System.out.println(a+" "+name);
        }
    
}
class B{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}

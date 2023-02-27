 class P046_superkeyword { //super class
    int a=10;
 }
 class Z extends P046_superkeyword{ //sub class
    int a=20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);//here we use super keyword
    }
    //*** super class ke variable of subclass me use krne ke liye humlog iska use krte hai */
 }
 class test{
    public static void main(String[] args) {
        ss1 obj=new ss1();
        obj.show();
        
    }
 }
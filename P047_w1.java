               ///if instance variable and local variable are same then /// 
 class P047_1 {
   int a;
   P047_1(int a) {
    a=a;//if we not put this keyword before a then it will show default value of int.
   }
   void show()
   {
    System.out.println(a);
   }
   public static void main(String[] args) {
    P047_1 obj=new P047_1(100);
    obj.show();
   }
}

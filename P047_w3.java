 class P047_3 {
    P047_3()
   {
    this(10);//this keyword ka use krke humlog default constructor me parameterized constructor ka value daal ke call kr skte hai

   } 
   P047_3(int a)
   {
   
    System.out.print(a);
   }
   public static void main(String[] args) {
    P047_3 obj=new P047_3();

   } 
}

class breakfast{
    void show1()
   {
       
       System.out.println("this is food");
   }
   }
   class launch extends breakfast{
       
       void show()
   {
       System.out.println("this is chowmin");
   }
   }
   class dinner extends breakfast{
       void show()
   {
       System.out.println("this is golgappa");
   }
   }
   class khana{
       public static void main(String[] args) {
           launch obj1=new launch();
           dinner obj= new dinner();
           obj1.show();
           obj.show();
           obj.show1();
           obj1.show1();
       }
   }
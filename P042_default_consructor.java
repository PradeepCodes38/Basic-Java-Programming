                        //default constructor
class S {
    int a;String b;boolean c;
  S(){
a=38;b="mahi";c=true;
  }  
  void show()
  {
    System.out.println(a+" "+b+" "+c);
  }
}
class D{
    public static void main(String[] args) {
        S obj=new S();
        obj.show();
    }
}

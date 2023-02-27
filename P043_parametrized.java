                            ///Parametrized contructor///
class P043_parametrized {
    int a,b;
  P043_parametrized(int x,int y)//parametrized 
  {
    a=x;b=y;
  }  
  void show()
  {
    System.out.println(a+" "+b);
  }
}
class xyz{
    public static void main(String[] args) {
        P043_parametrized obj=new P043_parametrized(10, 20);//pass parametrized value
        obj.show();
    }
}

                              ////////****method overloading****//////////

class matth{
    void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int s=x+y;
        System.out.println(s);
    }
    void add(String name,String age)///same method but different parameters
    {
        System.out.print(name);
        System.out.println(age);
    }
    }
    class finaal{
        public static void main(String[] args) {
            matth obj=new matth();
            obj.add();
            obj.add("mahi","20");
            obj.add(20, 30);
        }
    }
    ///***comppile time polymorphism me methods saame rehta hai but parameters alag alag rhta hai */

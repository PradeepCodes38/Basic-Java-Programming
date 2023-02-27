interface m1{
    int a=10;
    int b=20;
    void sum();///abstarct method
}
interface m2{
    void mul();

}
class mpl implements m1,m2{   //here implement replace extends for interface
    public void sum(){
        System.out.println("the sum of hte number is :"+(a+b));
    }
    public void mul(){
        System.out.println("the multiplication of the number is :"+(a*b));
    }
    public static void main(String[] args) {
        mpl obj=new mpl();
        obj.sum();
        obj.mul();
    }
}

///*** isme humlog ko interface ke method ko class ke andar define krna hoga */
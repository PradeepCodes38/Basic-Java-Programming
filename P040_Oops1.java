public class P040_Oops1 { //class
    //properties
    int age=40;
    int weight=75;
    String color="light";
    //behaviour
    void eat(){
        System.out.println("he is eating");
    }
    void sleep(){
        System.out.println("he is sleeping ");
    }
    public static void main(String[] args) {
        P040_Oops1 obj=new P040_Oops1(); //create object 
        System.out.println(obj.age);
        System.out.println(obj.weight);
        System.out.println(obj.color);
        obj.eat();//call the function
        obj.sleep();
    }
}

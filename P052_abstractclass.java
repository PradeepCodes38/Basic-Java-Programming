abstract class animal{
    void legs()
        {
            System.out.println("all animal has 4 legs");
        }
    
     abstract void sound();//because sound of all animals are not same
     abstract void eat();//because foods of all animals are not same

}
class dog extends animal{
    @Override
    void sound()
    {
        System.out.println("bark");
    }
    void eat()
    {
        System.out.println("every thing");
    }
}

class cow extends animal{
    @Override
    void sound()
    {
        System.out.println("moo");
    }
    void eat()
    {
        System.out.println("grass");
    }
}
class asclass{
    public static void main(String[] args) {
        dog d=new dog();
        cow c=new cow();
        d.legs();
        d.eat();
        d.sound();

        System.out.println("----------------------------------------");
        c.legs();
        c.eat();
        c.sound();
    }
}
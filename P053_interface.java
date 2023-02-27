interface vehicles{
    String company="TVS";//public+static+final
    int speed=100;//public+static+final
    void start();//public+abstract
    void stop();//public+abstract

    default void name(){
        System.out.println("the name of the company is :"+company);
    }

    static void speeds(){  ///statics method interface me bina object ke call hota hai
        System.out.println("the speed of the bike is 100km/hrs");
    }
}
class chalu implements vehicles{
    @Override
    public void start(){
        System.out.println(" start : enter the key and power on the switch");
    }
    @Override
    public void stop()
    {
        System.out.println("off : switch off the button");

        //System.out.println("speed of the bike is :"+speed);
    }
    public static void main(String[] args) {
        chalu obj=new chalu();
        obj.name();
       vehicles.speeds(); ///bina object ke call hua 
        obj.start();
        obj.stop();
}
}

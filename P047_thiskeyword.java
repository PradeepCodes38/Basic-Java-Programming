                            ///this keywords///
class P047_thiskeyword {
    void show()
    {
        System.out.println(this);//print this keyword
    }
    public static void main(String[] args) {
        P047_thiskeyword obj=new P047_thiskeyword();
        System.out.println(obj);//print object value
        obj.show();
    }
}

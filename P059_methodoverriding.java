
/////****method overriding ****/////

class ovr {
    void show() {
        System.out.println("cannot say");
    }
}

class over1 extends ovr {
    @Override
    void show() {
        System.out.println("rectangle");
    }
}

class ded {
    public static void main(String[] args) {
        over1 obj = new over1();
        obj.show();
    }
}

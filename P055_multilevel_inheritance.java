//multi-level inheritance//

class students {
    int roll = 38;
    String name = "mahi";

}

class stu1 extends students {
    int marks = 20;

    void show() {
        System.out.println("Name of students is :" + name);
        System.out.println("The roll no.of the student is :" + roll);
    }
}

class stu2 extends stu1 {
    void markss() {
        System.out.println("the marks in science is :" + marks);
    }
}

class total {
    public static void main(String[] args) {
        stu2 obj = new stu2();
        obj.show();
        obj.markss();
    }
}
                                ////*****user-defined Package*****////

package pradeep;

class aaa {
    private void name() {
        System.out.println("mahi");
    }

    public static void main(String[] args) {
        aaa n = new aaa();
        n.name();
    }
}

// isko dusre compiler me extension-javac -d.classname.java se compile krke
// packagename.classname se run kryaenge
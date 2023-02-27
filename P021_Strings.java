public class P021_Strings {
    public static void main(String[] args) {
        // concatenation of strings
        String fname = "mahi";
        String lname = "raj";
        String fullName = fname + " " + lname;
        System.out.println(fullName);
        // finding length of Strings
        System.out.println(fullName.length());// here length function is used to find the length of strings
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));//using of charAt for traveral of strings
        }
    }
}

import javax.lang.model.util.ElementScanner14;

public class P022_method_string {
    public static void main(String[] args) {
        //comparision of Strings
        //1. s1=s2==0
        //2. s1>s2==+ve value
        //3. s1<s2==-ve value
        String s1="piku";
        String s2="piku";
        if(s1.compareTo(s2)==0){//here .compareTo is used for comparing the strings
            System.out.println("equal");
        
        }
        else{
            System.out.println("not Equal");
        }      //upar case ya lower case kuch v ho compare hoga 
        String str1 = "piku";
        String str2 = "PIKU";
        if(str1.compareToIgnoreCase(str2)==0){
            System.out.println("equal");

        }
        else{
            System.out.println("not equal");
        }
        ///yha do string ko jodne ka kaam kiya jaa rha hai using concate
    String fName = "mahi ";
    String lName = "raj";
    System.out.println(fName.concat(lName));

    ///////random number generator


    int otp=(int)(Math.random()*9999);
    System.out.println(otp);

    
}
}

public class P024_strings_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mahi");// using stringbuilder
        
        System.out.println(sb);//normal print
       
        System.out.println(sb.length()); //finding the length of string
        
        System.out.println(sb.charAt(0));//using index find char
        
        System.out.println(sb.append("raj"));//adding element at the end 
        
        System.out.println(sb.insert(1, "a"));// System.out.println(sb.setCharAt( 0, "R"));
        System.out.println(sb.delete(0, 5));//delete element in range
        
    }
}

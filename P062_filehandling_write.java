import java.io.FileWriter;
import java.io.IOException;

                            /////****File handling - Write on file****/////

class fileWrite{
    public static void main(String[] args) {
        
        try{  //exception handling pe hi kaam krna hai isme
            FileWriter f=new FileWriter("C:\\Users\\mahig\\Desktop\\writer.txt");
        
        try{
            f.write("this is file handing lecture...");
        }
        finally{  //fianlly use hoga taaki file close ho sake Exampl- mobile hotspot after 5 min off
            f.close();
        }
    }
        catch(IOException re)
        {
System.out.println(re);
        }
        System.out.println("wroten in file successfully");
}
}

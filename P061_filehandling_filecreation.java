                   /////****file handling - file creation****/////

import java.io.*;
class filecreate{
    public static void main(String[] args) { //ya yha pe direct throws IOexception krke v kr skte hai
        File f=new File("C:\\Users\\mahig\\Desktop\\file.txt");//yha pe File name ka object bnayenge aur file ke parameter me location put krenge with \\ ka use krke.
        try 
        {
            if(f.createNewFile())  //exception handling ka use krenge
            
            {
                System.out.println("file created successfully");
            }
            else{
                System.out.println("file already exists");
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
        
    }
}
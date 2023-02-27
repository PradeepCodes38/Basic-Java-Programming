import java.io.*;

                                /////****Read-file data****/////

class fileReade{
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("C:\\Users\\mahig\\Desktop\\writer.txt"); //file reader keyword ka use kiye
        
        try{
            int i;
            while((i=r.read())!=-1)//yha pe int me humlog ukse value ko asssign kiye read line by line
            {
                System.out.print((char)i); //type-casting ka use agar nhi krte to sb character ka ASCII value print ho jata
            }
        }
    finally{
        r.close();
        
    }
}
catch(IOException f){
    System.out.println("file read succesfully");
    
    
    }
}
}

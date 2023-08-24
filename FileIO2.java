import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FileIO2 {
    //persisent storage => files 

    public static void main(String[] args) throws IOException,Exception{
        //parent  => path of the parent folder 
        //child  => path of the child
        // File ref2= new File("C:/Users/ashis/Desktop/java218","Human.java");
        // ref2.createNewFile();
        // File ref  = new File("C:/Users/ashis/Desktop/java218/test.py");

        // URI obj = new URI("C:/Users/ashis/Desktop/java218/test2.py");
       // File ref2 = new File(obj);
        //ref2.createNewFile();

        File f2 = new File("C:/Users/ashis/Desktop/java218/");
        File obj2 = new File(f2, "test2.py");

        obj2.createNewFile();

        // System.out.println(ref.canRead());
        // System.out.println(ref.canExecute());
        // System.out.println(ref.canWrite());
        // System.out.println(ref.getParent());
        // System.out.println(ref.isAbsolute());
        // System.out.println("file : "+ref.isFile());
        // System.out.println("folder : "+ref.isDirectory());



        // if(ref.exists()){
        //     System.out.println("it already exists");
        // }
        // else{
        //     ref.mkdir();
        // }

        // if(ref.exists()){
        //     System.out.println("the file exists");
        // }
        // else{
        //     System.out.println("file does not exist");
        //     ref.createNewFile();
            

        // }

    }

}

import java.io.File;
import java.io.IOException;

public class FileIO2 {
    //persisent storage => files 

    public static void main(String[] args) throws IOException{
        File ref  = new File("javafolder");


        System.out.println("file : "+ref.isFile());
        System.out.println("folder : "+ref.isDirectory());


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

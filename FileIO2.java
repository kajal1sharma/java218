import java.io.File;
import java.io.IOException;

public class FileIO2 {
    //persisent storage => files 

    public static void main(String[] args) throws IOException{
        File ref  = new File("test.py");

        if(ref.exists()){
            System.out.println("the file exists");
        }
        else{
            System.out.println("file does not exist");
            ref.createNewFile();
            
        }

    }

}

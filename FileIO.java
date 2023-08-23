import java.io.File;
import java.io.IOException;

public class FileIO {
   public static void main(String[] args) throws IOException {
    //     File obj = new File("abc.txt");
    //    if(!obj.exists()){

    //         obj.createNewFile();
    //    }
       File dir = new File("C:/Users/ashis/Desktop/java218/temp");
    System.out.println(dir.exists());
          if(!dir.exists()){
            dir.mkdir();
       }
   } 
}

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FileIO {

   static void printFiles(File parent,String []arr){

    for(String str : arr){
        File ref = new File(parent,str);
        if(ref.isDirectory()){
            System.out.println("-->D- "+str);
            String newarr[]= ref.list();
            printFiles(ref,newarr);
        }
        else{
            System.out.println("-->F- " + str);
        }
    }

   }
   public static void main(String[] args) throws IOException {

    File obj = new File("C:/Users/ashis/Desktop/java218");
    String arr [] = obj.list();
    printFiles(obj,arr);

    // for(String str:arr){
    //     File temp = new File(str);
    //     System.out.println(temp.isDirectory());

    //     System.out.println(str);
    // }
   
    

    // File obj = new File("C:/Users/ashis/Desktop/java218/temp");
    // File file = new File(obj,"abc.txt");

   
    // if(!file.exists()){
    //     file.createNewFile();
    // }
    //     File obj = new File("abc.txt");
    //    if(!obj.exists()){

    //         obj.createNewFile();
    //    }
    //    File dir = new File("C:/Users/ashis/Desktop/java218/temp");
    // System.out.println(dir.exists());
    //       if(!dir.exists()){
    //         dir.mkdir();
    //    }
   } 
}

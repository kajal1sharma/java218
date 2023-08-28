import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;

public class FileIO2 {
    //persisent storage => files 

    public static void main(String[] args) throws IOException{


        FileWriter fw = new FileWriter("abc.txt");
        fw.write(48);
        fw.write(49);
        fw.write(97);
        fw.write(98);

        fw.write("tree");
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        fw.write(ch, 2, 4);
    

        //moving characters one by one
        fw.close();

       // File f = new File("test.py");
        
       // FileWriter fw = new FileWriter(f);
        // FileWriter fw2 =new FileWriter(f, true);
        // //fw2= new FileWriter("");
        // fw2.write("hello this a python file");

        // fw2.close();

        // File f= new File("C:/Users/ashis/Desktop/java218");
        // String arr[]=f.list();

        //all the  files and folders list out => from the nesting also 
        // for(String ele: arr){
        //     File temp = new File(ele);
        //     if(temp.isHidden())
        //     System.out.println(ele);
        // }

       // URI uri = new URI("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?cs=srgb&dl=pexels-pixabay-268533.jpg&fm=jpg");
    //    URI uri = new URI("file://C:/Users/ashis/Desktop/java218/test2.py") ;
    //    System.out.println(uri.toString());
    //     System.out.println(uri.getScheme());
        
    //     File f2= new File(uri);
        //list only folders


        //parent  => path of the parent folder 
        //child  => path of the child
        // File ref2= new File("C:/Users/ashis/Desktop/java218","Human.java");
        // ref2.createNewFile();
        // File ref  = new File("C:/Users/ashis/Desktop/java218/test.py");

        // URI obj = new URI("C:/Users/ashis/Desktop/java218/test2.py");
       // File ref2 = new File(obj);
        //ref2.createNewFile();

        // File f2 = new File("C:/Users/ashis/Desktop/java218/");
        // File obj2 = new File(f2, "test2.py");

        // obj2.createNewFile();

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

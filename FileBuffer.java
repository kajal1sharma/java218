import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileBuffer {
    public static void main(String[] args) throws FileNotFoundException,IOException{
       
//USER WILL GIVE INPUT THROUGH CONSOLE FOR MULTIPLE LINES YOU HAVE TO WRITE IT INTO THE FILE
        Scanner sc= new Scanner(System.in);
        FileWriter f= new FileWriter("abc.txt",true);
        BufferedWriter bw = new BufferedWriter(f,100000);
        
        int ch=1;
        while(true){
           
           String s= sc.nextLine();
            // sc.next();
            bw.write(s);
            System.out.println("Do you want to continue (0 to exit )");
            
            ch= sc.nextInt();//next line 
            if(ch==0){
                break;
            }
            sc.nextLine();
        }

       

        bw.close();
        f.close();
       
        // FileReader f = new FileReader("FileIO.java");
      
        // BufferedReader br = new BufferedReader(f, 100);

        // String str= br.readLine();
        // while(str!=null){
        //     System.out.println(str);
        //     str=br.readLine();
        // }
    }
}

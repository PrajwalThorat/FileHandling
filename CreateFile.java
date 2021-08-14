import java.io.File;
import java.io.IOException;

/**
 * Create the New File
 */
public class CreateFile {

    public static void main(String[] args) {

        try {
            File newFile = new File("NewFile.txt");   //File myObj = new File("C:\\Users\\MyName\\filename.txt"); --> also we write a path
            if(newFile.createNewFile()){
                System.out.println("File Created : "+newFile.getName());
            }else{
                System.out.println("File Already Exist");
            }    
        } catch (Exception e) {
            System.out.println("An Error Occured");
            e.printStackTrace();
            //TODO: handle exception
        }
        

    }
}
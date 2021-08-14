import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try {
            FileWriter writefile = new FileWriter("NewFile.txt");
            writefile.write("file in java might be tricky , but its fun enough!");
            writefile.close();
            System.out.println("Sucessfully wrote in the file");
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
            //TODO: handle exception
        }
    }
    
}

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            File readFile = new File("NewFile.txt");
            Scanner scanner = new Scanner(readFile);
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
            //TODO: handle exception
        }
    }
    
}

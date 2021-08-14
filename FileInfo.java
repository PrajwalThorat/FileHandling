import java.io.File;

public class FileInfo {

    public static void main(String[] args) {
        File getFile = new File("NewFile.txt");
        if (getFile.exists()) {                                             //Tests whether the file exists
            System.out.println("File Name : "+getFile.getName());           // Returns the name of the file
            System.out.println("Absolute Path : "+getFile.getAbsolutePath());  //Returns the absolute pathname of the file
            System.out.println("Writable : "+getFile.canWrite());              //Tests whether the file is writable or not
            System.out.println("Readable : "+getFile.canRead());                //Tests whether the file is readable or not
            System.out.println("File size in Byte : "+getFile.length());        //Returns the size of the file in bytes
        }else{
            System.out.println("File Not Exits");
        }
    }
    
}

/**There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc. */

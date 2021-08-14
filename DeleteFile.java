import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File deleteFile = new File("name.txt");
            if(deleteFile.delete()){
                System.out.println("File Deleted : "+deleteFile.getName());
            }else{
                System.out.println("Failed to Delete File");
            }
        } catch (Exception e) {
            System.out.println("File Not Found Exeption Occured");
            e.printStackTrace();
            //TODO: handle exception
        }
    }
}

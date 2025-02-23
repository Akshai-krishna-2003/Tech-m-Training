import java.io.File;
import java.io.IOException;

public class P3_CreateFileDemo {
    public static void main(String args[]) throws IOException {
     /* File file1 = new File("D:\\abcfile1.txt");
       file1.createNewFile();*/

        File folder = new File("files");
        folder.mkdir();
        File file1 = new File("files", "abcfile1.txt");
        file1.createNewFile();
    }
}
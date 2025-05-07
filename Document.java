import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// File Reader Source: https://www.w3schools.com/java/java_files_read.asp
public class Document {
    public static void main(String Args[]) {
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("May mali ka, bonkers");
            e.printStackTrace();
        }
    }
}
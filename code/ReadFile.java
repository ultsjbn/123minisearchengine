package code;// Import needed libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// File Reader Source: https://www.w3schools.com/java/java_files_read.asp
public class ReadFile {
    public static void main(String[] Args) {

        System.out.println("-------------------------------");
        System.out.println("-     This is CheeseBolts!    -");
        System.out.println("-------------------------------");
        // bonjers
        try {
            File Doc1 = new File("documents/test.txt");
            Scanner myReader = new Scanner(Doc1);
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
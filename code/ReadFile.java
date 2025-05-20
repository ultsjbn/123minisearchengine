package code;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// File Reader Source: https://www.w3schools.com/java/java_files_read.asp
// File Search Source : https://youtu.be/v52qiUkIDCI
public class ReadFile {
    public static void main(String[] Args) {

        Scanner obj = new Scanner(System.in);
        File input = new File("documents/test.txt");

        FileReader fr = null;
        String SearchWord, str = "";

        System.out.println("-------------------------------");
        System.out.println("-     This is CheeseBolts!    -");
        System.out.println("-------------------------------");
        System.out.print("\uD83D\uDD0D "); // unicode for emoji
        SearchWord = obj.nextLine();

        try {
            fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);

            while((str = br.readLine())!=null){
                if(str.contains(SearchWord)){
                    System.out.println(str + " is found in " + input.getName());
                    System.out.println(str);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
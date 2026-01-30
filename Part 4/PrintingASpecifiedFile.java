
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename;
        
        filename=scanner.nextLine();
        findFile(filename);
        }
    public static void findFile(String filename) {
        try(Scanner scanner=new Scanner(Paths.get(filename))){
        while(scanner.hasNextLine()){
            String row=scanner.nextLine();
            System.out.println(row);}
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());;
        }
    }
}

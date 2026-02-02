
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        

        // Write here the code for reading from file
        try(Scanner scanner=new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
            String[]parts=line.split(",");
            String name=parts[0];
            int age=Integer.valueOf(parts[1]);
                System.out.println(name+","+"age:"+age+" years");
            }        
        
        return persons;

    }   catch (IOException ex) {
            System.out.println("Error: "+ ex);
        }
        return null;
    }
}


import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        String user=scanner.nextLine();
        String[] spit=user.split(" ");
        
        for(int i = 0; i < spit.length; i++) {
            System.out.println(spit[i]);
            }
        }
    }   
}

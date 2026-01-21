
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value=0;
        int max=0;
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] part=input.split(",");
            value=Integer.valueOf(part[1]);    
            if(value>max){
            max=value;
            }
        }
        System.out.println(max);
    }
}

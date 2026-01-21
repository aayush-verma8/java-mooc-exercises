
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int leng=0;
        int lon=0;
        int sum=0;
        int count=0;
        while(true){
            String input=scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] part=input.split(",");
            sum =sum+Integer.valueOf(part[1]);
            count++;
            leng=part[0].length();
            
            if(lon<leng){
                lon=leng;
                name=part[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }
}

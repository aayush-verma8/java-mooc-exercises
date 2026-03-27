
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);    
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount >= 0) {
                if (firstVolume <= maxVolume) {
                    firstVolume += amount;
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }
                }
            }
            if(command.equals("move")){
                firstVolume-=amount;
                secondVolume+=amount;
                if(firstVolume<0){
                    secondVolume+=firstVolume;
                    firstVolume=0;
                }
                if (secondVolume > maxVolume) {
                        secondVolume = maxVolume;
                    }
            }
            if(command.equals("remove")){
                secondVolume-=amount;
                if(secondVolume<0){
                secondVolume=0;
                }
            }
        }
    }
}

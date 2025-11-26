
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        String asv=scanner.nextLine();
        if(asv.equals("")){
            break;
        }
        
        String[] array=asv.split(" ");
        
        for(int i=0;i<array.length;i++){
            if(array[i].contains("av")){
                System.out.println(array[i]);
                }
            }
        }
    }
}

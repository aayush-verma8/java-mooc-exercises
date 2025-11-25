
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        System.out.println("Enter Password:");
        String username=scanner.nextLine();
        String password=scanner.nextLine();
        if(username.equals("alex")){
            if(password.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }
        if(username.equals("emma")){
            if(password.equals("haskell")){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book>book=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while(true){
        System.out.println("Title: ");
        String tit=scanner.nextLine();
        if(tit.isEmpty()){
            break;
            }
            System.out.println("Pages: ");
            int page=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year=Integer.valueOf(scanner.nextLine());
            book.add(new Book(tit,page,year));
        }
        System.out.println("What information will be printed?");
        String print=scanner.nextLine();
        for(Book i:book){
        if(print.equals("everything")){
            System.out.println("Title: "+ i.getTitle()+", "+ i.getPages()+" pages"+", "+i.getYear());
            }else if(print.equals("name")){
                System.out.println(i.getTitle());
            }        
        }
    }
}


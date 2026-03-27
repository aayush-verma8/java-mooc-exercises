
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner=scanner;
        this.dictionary=dictionary;
        }
        public void start(){
            //System.out.print("command: ");
            
            while(true){   
                System.out.println("Command: ");
                String input=scanner.nextLine();
                if(input.contains("end")){
                    System.out.println("Bye bye!");
                    break;
                }else if(input.contains("add")){
                    System.out.println("Word: ");
                    String word=scanner.nextLine();
                    System.out.println("Translation: ");
                    String translation=scanner.nextLine();
                    this.dictionary.add(word, translation);
                }else if(input.contains("search")){
                    System.out.println("To be translated: ");
                    String tobe=scanner.nextLine();
                    String trans=this.dictionary.translate(tobe);
                    if(trans==null){
                        System.out.println("Word "+ tobe +" was not found ");
                    }else{
                        System.out.println("Translation: "+trans);
                    }
                }else{
                    System.out.print("Unknown commond ");
                }           
            }
        }
}

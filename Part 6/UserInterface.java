
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
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist,Scanner scanner){
        this.list=todolist;
        this.scanner=scanner;
    }
    public void start(){
        //System.out.println("Command: ");
        
        while(true){
            System.out.println("Command: ");
            String input=scanner.nextLine();
        if(input.equals("stop")){
            break;
            }
        if(input.contains("add")){
            System.out.println("To add: ");
            String task=scanner.nextLine();
            this.list.add(task);           
            }
        if(input.contains("list")){
            list.print();
            }
        if(input.contains("remove")){
            System.out.println("Which one is removed?");
            int number=scanner.nextInt();
            this.list.remove(number);
            }
        }
    }
}

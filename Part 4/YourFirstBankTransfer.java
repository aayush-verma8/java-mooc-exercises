
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matthews=new Account("Matthews account",1000);
        Account my=new Account("My account",0);
        Matthews.withdrawal(100.0);
        my.deposit(100.0);
        System.out.println("The balance of Matthews account is now:"+ Matthews);
        System.out.println("The balance of my account is now:"+ my);
    }
}

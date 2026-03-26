import java.util.Scanner;
 class Bank {
    private int balance;
    public void deposit(int amount){
        balance=balance+amount;
    }
    public int getBalance(){
        return balance;
    }
}
    public class Main{
    public static void main(String args[]){
        Bank b=new Bank();
        b.deposit(1000);
        System.out.println(b.getBalance());
        b.deposit(1000);
        System.out.print(b.getBalance());
    }
    
}


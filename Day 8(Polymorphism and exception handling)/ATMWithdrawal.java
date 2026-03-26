import java.util.*;
class InsufficientFundsException extends Exception{
    String msg;
    InsufficientFundsException(String msg){
        super(msg);
    }
}
public class ATMWithdrawal {
    public static void withdraw(int balance,int wdraw){
        try{
            if(wdraw<0){
                throw new IllegalArgumentException("Invalid");
            }
            if(wdraw>balance){
                throw new InsufficientFundsException("Not enough balance");

            }
            else{
                System.out.println("Withdrawal sucessful.Remaining:"+(balance-wdraw));
            }
        }
        catch(InsufficientFundsException e){
            System.out.print(e);

        }
        catch(IllegalArgumentException e){
            System.out.print(e);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int wdraw=sc.nextInt();
        withdraw(balance,wdraw);
    }

}

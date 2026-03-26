abstract class Payment{
    int amount;
    Payment(int amount){
        this.amount=amount;
    }
    abstract void pay();
    void showAmount(){
        System.out.println("amount: "+amount);
    }

}
class CreditCard extends Payment{
    CreditCard(int amount){
        super(amount);
    }
    void pay(){
        System.out.println("paid "+amount+" using CreditCard");
    }
}
class DebitCard extends Payment{
    DebitCard(int amount){
        super(amount);
    }
    void pay(){
        System.out.println("paid "+amount+" using DebitCard");
    }
}
public class Abstraction {
    public static void main(String args[]){
        Payment ob=new CreditCard(1000);
        ob.pay();
        ob.showAmount();
        Payment ob2=new DebitCard(2000);
        ob2.pay();
        ob2.showAmount();
        
        

    }
    
}

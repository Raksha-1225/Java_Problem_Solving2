import java.util.*;
class InvalidAgeException extends Exception{
    String msg;
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void checkAge(int age){
        try{
            if(age<18){
                throw new  InvalidAgeException("Age must be above 18");
            }
            else{
                System.out.print("Eligible to vote");
            }
        }
        catch(InvalidAgeException e){
            System.out.print(e);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        checkAge(age);
    }
    
}

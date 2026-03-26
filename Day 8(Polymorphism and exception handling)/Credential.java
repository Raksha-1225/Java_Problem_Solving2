import java.util.*;
class InvalidLoginException extends Exception{
    String msg;
    InvalidLoginException(String msg){
        super(msg);
    }
}
public class Credential {
    public static void check(String s,String p){
        try{
            if(s.equals("")){
                throw new NullPointerException("Invalid");
            }
            if(!s.equals("admin")||!p.equals("pass123")){
                throw new InvalidLoginException("Invalid Credentials");

            }
            else{
                System.out.println("Login Successful");
            }
        }
        catch(InvalidLoginException e){
            System.out.print(e);

        }
        catch(NullPointerException e){
            System.out.print(e);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        String password=sc.nextLine();
        check(username,password);
    }

}

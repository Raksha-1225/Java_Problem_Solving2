class Whatsapp extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Updating Status");
        }

    }
}
class Insta extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Updating story");
        }
    }
}
    


public class MultiThreading1 {
    public static void main(String args[]){
        Whatsapp w=new Whatsapp();
        Insta i=new Insta();
        w.start();
        i.start();
        try{
            w.join();
            i.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bye");
    }
    
}

class Whatsapp extends Thread{
    public void start(){
        for(int i=0;i<5;i++){
            System.out.println("Updating Status"+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
            System.out.println(e.getMessage());
            }
        }

    }
}
class Insta extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Updating story"+" "+Thread.currentThread().getName());
        }
        try{
            Thread.sleep(4500);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class MultiThreading4 {
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

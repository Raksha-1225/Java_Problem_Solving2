class Whatsapp implements Runnable{
    public void run(){
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
class Insta extends Whatsapp implements Runnable{
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

public class MultiThreading5 {
    public static void main(String args[]){
        Whatsapp w=new Whatsapp(); 
        Insta i=new Insta();
        Thread t1=new Thread(w);
        Thread t2=new Thread(i);
        t1.start();
        t2.start();
        System.out.println("Bye");
    }
    
}

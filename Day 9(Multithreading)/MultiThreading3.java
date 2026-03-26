class Whatsapp extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Updating Status"+" "+Thread.currentThread().getPriority());
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
            System.out.println("Updating story"+" "+Thread.currentThread().getPriority());
        }
        try{
            Thread.sleep(4500);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class MultiThreading3 {
    public static void main(String args[]){
        Whatsapp w=new Whatsapp(); 
        Insta i=new Insta();
        w.setName("wp");
        i.setName("ig");
        w.setPriority(8);
        i.setPriority(4);
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

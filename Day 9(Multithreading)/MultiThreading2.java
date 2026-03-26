class Whatsapp extends Thread{
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

public class MultiThreading2 {
    public static void main(String args[]){
        Whatsapp w=new Whatsapp();
        System.out.println(w.isAlive());
        Insta i=new Insta();
        w.setName("wp");
        i.setName("ig");
        w.start();
        i.start();
        System.out.println(w.isAlive());
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

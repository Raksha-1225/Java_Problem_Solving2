class Cleaner extends Thread{
    public void run(){
        while(true){
            System.out.print("Cleaning"+" ");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
        
            }
        }
    }
}
public class DaemonThread {
    public static void main(String args[]){
        Cleaner c=new Cleaner();
        c.setDaemon(true);
        c.start();
        System.out.println("Main ends");

    }
    
}

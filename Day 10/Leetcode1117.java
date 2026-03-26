class H2O{
    int hcount=0;
    public synchronized void hydrogen(){
        while(hcount==2){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.print("H");
        hcount++;
        notifyAll();
    }
    public synchronized void oxygen(){
        while(hcount<2){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());

            }
        }
        System.out.print("O"+" ");
        hcount=0;
        notifyAll();
    }
}
class HydrogenThread extends Thread{
    H2O h;
    HydrogenThread(H2O h){
        this.h=h;
    }
    public void run(){
        h.hydrogen();
    }
}
class OxygenThread extends Thread{
    H2O h;
    OxygenThread(H2O h){
        this.h=h;
    }
    public void run(){
        h.oxygen();
    }
}
public class Leetcode1117 {
    public static void main(String args[]){
     
    H2O h=new H2O();
    Thread t1=new HydrogenThread(h);
    Thread t2=new HydrogenThread(h);
    Thread t3=new OxygenThread(h);
    Thread t4=new HydrogenThread(h);
    Thread t5=new HydrogenThread(h);
    Thread t6=new OxygenThread(h);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    }
    
}

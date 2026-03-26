class Counter{
    int count=0;
    synchronized void increment(){
        count++;
    }
}
class Mythread extends Thread{
    Counter c;
    Mythread(Counter c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<500;i++){
            c.increment();
        }
    }
}
public class Synchronisation {
    public static void main(String args[]){
    Counter c=new Counter();
    Mythread t1=new Mythread(c);
    Mythread t2=new Mythread(c);
    t1.start();
    t2.start();
    try{
        t1.join();
        t2.join();
    }
    catch(InterruptedException e){
        System.out.print(e);
    }
    System.out.print(c.count);
}
    
}

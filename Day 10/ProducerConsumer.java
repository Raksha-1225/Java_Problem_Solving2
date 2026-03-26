class Buffer{
    int data;
    boolean available=false;
    public synchronized void produce(int value){
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        data=value;
        System.out.println("Produced:"+value);
        available=true;
        notifyAll();
    }
    public synchronized void consume(){
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());

            }
        }
        System.out.println("Consumed:"+data);
        available=false;
        notifyAll();
    }
}
class Producer extends Thread{
    Buffer b;
    Producer(Buffer b){
        this.b=b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            b.produce(i);
            try{
                sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
class Consumer extends Thread{
    Buffer b;
    Consumer(Buffer b){
        this.b=b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            b.consume();
            try{
                sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }


}
public class ProducerConsumer {
    public static void main(String args[]){
    Buffer b=new Buffer();
    Producer p=new Producer(b);
    Consumer c=new Consumer(b);
    p.start();
    c.start();
    }
    
}

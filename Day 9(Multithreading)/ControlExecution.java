class ThreadA extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("A"+" ");
        }
    }

}
class ThreadB extends Thread{
     public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("B"+" ");
        }
    }

}
class ThreadC extends Thread{
     public void run(){
        for(int i=0;i<=2;i++){
            System.out.println("C"+" ");
        }
    }
    
}
public class ControlExecution {
    public static void main(String args[]){
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        try{
            a.start();
            a.join();
            b.start();
            b.join();
            c.start();
            c.join();
        }
        catch(InterruptedException e){
            System.out.print(e);
        }
    }
    
}

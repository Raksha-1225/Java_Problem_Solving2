class MyThread implements Runnable{
    public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
public class Thread_Group {
    public static void main(String args[]){
    ThreadGroup tg=new ThreadGroup("Ngp");
    MyThread m=new MyThread();
    Thread t1=new Thread(tg,m,"Student-1");
    Thread t2=new Thread(tg,m,"Student-2");
    Thread t3=new Thread(tg,m,"Student-3");
    t1.start();
    t2.start();
    t3.start();
    System.out.println(tg.activeCount());
    System.out.println(tg.getName());
    tg.list();
    }

    
}

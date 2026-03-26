class Even extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
    }

}
class Odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
    }

}
public class OddEven {
    public static void main(String args[]){
        Even e=new Even();
        Odd o=new Odd();
        o.setName("Odd Thread");
        e.setName("Even Thread");
        e.start();
        o.start();

    }
    
}

class Notification{
    void note(){
        System.out.println("Notification:");
    }

}
class EmailNotification extends Notification{
    void note(){
        System.out.println("This is EmailNotification class");
    }

}
class SMSNotification extends Notification{
    void note(){
        System.out.println("This is SMSNotification class");
    }

}
class PushNotification extends Notification{
    void note(){
        System.out.println("This is PushNotification class");
    }

}
public class NotificationSystem {
    public static void main(String args[]){
        Notification n;
        n=new EmailNotification();
        n.note();
        n=new SMSNotification();
        n.note();
        n=new PushNotification();
        n.note();
        
    }
    
}

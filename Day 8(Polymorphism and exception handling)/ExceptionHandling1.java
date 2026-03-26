
public class ExceptionHandling1 {
    public static void main(String args[]){
        System.out.println("start");
        try{
            String s=null;
            System.out.println(s.length());
            int a=5;
            int b=0;
            System.out.println(a/b);
            int arr[]=new int[5];
            arr[6]=5;       
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
    
}

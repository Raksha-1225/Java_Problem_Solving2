import java.util.*;
public class PriorityQueueOp {
    public static void main(String args[]){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.offer(12);
        p.offer(25);
        p.offer(5);
        p.offer(13);
        int n=p.size();
        System.out.println(p.peek());
        for(int i=0;i<n;i++){
            System.out.print(p.poll()+" ");
        }
        System.out.println();
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("harry");
        pq.offer("ron");
        pq.offer("hermione");
        pq.offer("draco");
        pq.offer("neville");
        n=pq.size();
        for(int i=0;i<n;i++){
            System.out.print(pq.poll()+" ");
        }


    }
    
}

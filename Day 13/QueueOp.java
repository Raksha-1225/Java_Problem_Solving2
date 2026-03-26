import java.util.*;
class QueueOp{
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<Integer>();
        q.offer(2);
        q.offer(4);
        q.offer(9);
        q.offer(10);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());


    }
}
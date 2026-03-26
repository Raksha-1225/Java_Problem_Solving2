import java.util.*;
public class DequeOp {
    public static void main(String args[]){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(4);
        dq.offerLast(7);
        dq.offerFirst(3);
        dq.offerFirst(5);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);


    }

}

import java.util.*;
public class ReverseQueue {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.offer(8);
        q.offer(9);
        q.offer(11);
        q.offer(14);
        q.offer(15);
        q.offer(18);
        System.out.println(q);
        int k=4;
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<k){
            st.push(q.poll());
            i++;
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
         
        i=0;
        while(i<q.size()-k){
            q.offer(q.poll());
            i++;
        }
        System.out.println(q);

    }
    
}

import java.util.*;
public class StackClass {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(7);
        st.push(5);
        st.push(14);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
    
}

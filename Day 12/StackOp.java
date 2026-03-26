import java.util.*;
public class StackOp {
    Stack<Integer> st;
    public StackOp(){
        st=new Stack<>();
    }
    public void push(int val){
        st.push(val);

    }
    public void pop(){
        if(!st.isEmpty()){
            st.pop();
        }
    }
    public int peek(){
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
    public static void main(String args[]){
        StackOp obj=new StackOp();
        obj.push(5);
        obj.push(4);
        obj.push(8);
        obj.pop();
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());


    }
    
}

import java.util.*;
public class StudentSet {
    public static void main(String args[]){
        Set<Student> st = new HashSet<>();
        st.add(new Student(1,"Ram"));
        st.add(new Student(2,"Ramya"));
        st.add(new Student(3,"Jaanu"));
        System.out.println(st);
    }
}
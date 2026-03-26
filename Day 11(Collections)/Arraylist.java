import java.util.*;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> hp=new ArrayList<>();
        hp.add("Harry Potter");
        hp.add("Hermione Granger");
        hp.add("Ron Weasley");
        hp.add("Ginny Weasley");
        System.out.println(hp);
        hp.set(3,"Nivelle Longbottom");
        System.out.println(hp);
        System.out.println(hp.get(0));
        ArrayList<String> p=new ArrayList<>();
        p.add("Remus Lupin");
        p.add("Sirius Black");
        p.add("Albus Dumbledore");
        System.out.println(p);
        hp.addAll(p);
        System.out.println(hp);
        hp.remove("Harry Potter");
        p.clear();
        System.out.println(p);
        

    
    }
    
}

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {
    public static void main(String args[]){
        Set<Integer> h=new HashSet<>();
        h.add(7);
        h.add(17);
        h.add(13);
        h.add(26);
        h.add(26);
        h.add(247);
        h.add(247);
        System.out.println(h);
        System.out.println(h.contains(7));
        h.remove(247);
        System.out.println(h);
        Set<Integer> lh=new LinkedHashSet<>();
        lh.add(7);
        lh.add(17);
        lh.add(13);
        lh.add(26);
        lh.add(26);
        lh.add(247);
        System.out.println(lh);
        Set<Integer> th=new TreeSet<>();
        th.add(7);
        th.add(17);
        th.add(13);
        th.add(26);
        th.add(26);
        th.add(247);
        System.out.println(th);


    }
    
}

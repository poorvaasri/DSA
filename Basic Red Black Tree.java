//Tree with static input
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(43);
        set.add(12);
        set.add(10);
        System.out.println(set);
        System.out.println();
        List<Integer> list = new ArrayList<>(set);//cannot do any operations using index so convert into list
    }
            
}

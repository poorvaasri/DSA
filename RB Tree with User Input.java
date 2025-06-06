import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of tree:");
		int size = sc.nextInt();
		for(int i = 0; i < size; i ++) {
		    System.out.println("Enter elements:");
		    int val = sc.nextInt();
		    set.add(val);
		}
        System.out.println(set);
        System.out.println();
        List<Integer> list = new ArrayList<>(set);
    }
            
}

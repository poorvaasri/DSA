import java.util.PriorityQueue;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
	    
	    PriorityQueue<Integer> minheap = new PriorityQueue<>();
	    
	    int[] arr = {3, 10, 5, 20, 45, 89, 4, 12};
	    
	    for (int a : arr)
	    {
	        minheap.add(a);
	    }
	    System.out.println(minheap);
	    
	    while(! minheap.isEmpty())
	    {
	         System.out.print(minheap.poll() + " ");  
	    }
	}
}



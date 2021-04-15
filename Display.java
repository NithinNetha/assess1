package assessProj;
import java.util.*;

public class Display {

	public void selectionSort(List<String> list) {


	    for (int i = 0; i < list.size(); i++) {
	        String smallest = list.get(i);
	        int smallestIndex = i;
	        for (int j = i; j < list.size(); j++) {
	            String value = list.get(j);
	            if (value.compareTo(smallest) > 0) {
	                smallest = value;
	                smallestIndex = j;
	            }
	        }

	        if (smallestIndex != i) {
	            String head = list.get(i);
	            list.set(i, smallest);
	            list.set(smallestIndex, head);
	        }
	    }

	    System.out.println(list);
	}
		
	}



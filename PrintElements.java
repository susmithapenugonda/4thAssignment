package assignmentfour;

import java.util.ArrayList;
import java.util.List;

public class PrintElements {

	public static void main(String[] args) {
		 
		List<Integer> myList = new ArrayList<Integer>();
		 
	        
	        myList.add(10);
	        myList.add(45);
	        myList.add(90);
	        myList.add(45);
	        myList.add(23);
	        myList.add(90);
	        myList.add(44);
	        
	        System.out.println(myList);
	        
	        //Second Element
	        System.out.println(myList.get(1));
	        
	        //Second Last Elemet
	        System.out.println(myList.get(myList.size()-2));

	        
	        
	}

}

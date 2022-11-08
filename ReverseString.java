package assignmentfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		list.add("Git");
		list.add("Github");
		
		
		//ArrayList elements before reverse
		System.out.println("Current Order : " + list);
		
		//Reverse Order
		Collections.reverse(list);
		
		//ArrayList elements after reverse
		
		System.out.println("Reverse Order : " + list);

}
}

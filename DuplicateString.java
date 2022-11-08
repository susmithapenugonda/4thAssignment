package assignmentfour;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {
		
     List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("TestNG");
		list.add("Maven");
		list.add("Java");

		System.out.println("Original List is : " + list);
		
        //Finding duplicates using distinct
		list = list.stream().distinct().collect(Collectors.toList());
        
        System.out.println("After Duplicates list is: " + list);
			}

}

package assignmentfour;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Git");
		list.add("Github");
		list.add("GitLab");
		list.add("GitBash");
		list.add("Selenium");
		list.add("Java");
		list.add("Maven");
		
		System.out.println("Original List is :" + list);
		
		for(String str:list) {
			
			System.out.println(str.contains("Git"));
		
			}
		
	System.out.println(list.subList(0,4));
	 
		

	}

}

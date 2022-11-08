package assignmentfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleLists {

	public static void main(String[] args) {

		
		

		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
				
		ArrayList<ArrayList<Integer>> list4=new ArrayList<>();
		
		
		System.out.println(list1.addAll(list3));
	}

}

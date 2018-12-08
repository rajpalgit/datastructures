

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testing {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(456);
		list.add(932);
		list.add(659);
		list.add(213);
		
//		Collections.sort(list);
		
		/*Comparator<Integer> c = new Comparator<Integer>() 
		{
			public int compare(Integer i, Integer j) {
				
				if(i%10>j%10) {
					return 1;
				}else {
					return -1;
				}
				
				return i%10>j%10?1:-1;
			}
			
		};*/
		
		Comparator<Integer> c =( i, j) -> i%10>j%10?1:-1;
			
		//Collections.sort(list, c);
		
		Collections.sort(list, ( i, j) -> i%10>j%10?1:-1);
		
		for(Integer a: list) {
			
			System.out.println(a);
		}
		

	}

}

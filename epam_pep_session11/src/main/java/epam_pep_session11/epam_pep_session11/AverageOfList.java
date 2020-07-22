package epam_pep_session11.epam_pep_session11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AverageOfList {

	public static void main1() {
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("taking first 20 natural numbers as array");
		
		for(int i=1;i<=20;i++) {
			list.add(i);
		}
		
		System.out.print("Average = ");
		
		Object o = getAverage(list);
		Optional<Object> p =Optional.ofNullable(o);
		p.ifPresent(System.out::println);

	}

	private static Double getAverage(List<Integer> list) {
		 Integer sum = 0;
		 
		 for(Integer i:list) {
			 sum += i;
		 }
		 
		 return 1.0*sum/list.size();
	}

}
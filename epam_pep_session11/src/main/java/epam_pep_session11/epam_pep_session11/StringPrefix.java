package epam_pep_session11.epam_pep_session11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPrefix {

	public static void main1() {

		System.out.println("Taking following strings as static input\n");
		List<String> list = Arrays.asList("ask","adder","add","charley","ask","aaa","Abc","abbas");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println("");
		System.out.println("String with size 3 and starting with  a\n");
		filterPrefix(list).forEach(System.out::println);
	}

	private static List<String> filterPrefix(List<String> list) {
		return list.stream().filter(s -> s.length()==3 && s.charAt(0)=='a').collect(Collectors.toList());
	}

}
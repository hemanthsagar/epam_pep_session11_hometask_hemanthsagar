package epam_pep_session11.epam_pep_session11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringPalindrome {

	public static void main1() {
		
		System.out.println("Taking following strings as static input\n");
		
		List<String> list = Arrays.asList("window","sagar","bob","dad","ball","palindrome","mom");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println("");
		System.out.println("Palindrome strings are :");
		
		filterPalindrome(list,PalindromeChecker::check).forEach(System.out::println);
	}

	private static List<String> filterPalindrome(List<String> list, Predicate<String> myPredicate) {
		return list.stream().filter(str -> myPredicate.test(str)).collect(Collectors.toList());
	}

}
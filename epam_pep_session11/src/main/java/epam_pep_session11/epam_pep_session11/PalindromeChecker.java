package epam_pep_session11.epam_pep_session11;

public class PalindromeChecker {	
	public static boolean check(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
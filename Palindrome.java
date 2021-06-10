public class Palindrome {
public static boolean IsPalindrome(String s) {
	if(s.length() <= 1) {
		return true;
	}
	else if(s.charAt(0)!=s.charAt(s.length()-1)) {
		return false;
	}
	else {
		return IsPalindrome(s.substring(1, s.length()-1));
	}
}
public static void main(String[] args) {
	String check = "malayalams";
	if(IsPalindrome(check)) {
		System.out.println("KABU YAYYY RECURZOOON FINALSS");
	}
}
}

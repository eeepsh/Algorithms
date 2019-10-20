package MidTermExam;

public class Palindrome {
	public static void main(String[] arg) {

		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome("madam"));
	}

	public boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
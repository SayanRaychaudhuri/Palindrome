import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		System.out.println(isPalindrome(word));
		main(null);
	}
	public static boolean isPalindrome (String word){ 
		// My older version was simpler. Why did I have to make it fancy!
		String lcWord = word.toLowerCase();
		int length = lcWord.length();
		int halfLength = length/2;
        String firstHalf = length % 2 == 0 ? lcWord.substring(0,halfLength) : lcWord.substring(0,halfLength+1);
        String secondHalf = lcWord.substring(halfLength);
		StringBuffer buffer = new StringBuffer(firstHalf);
		String reverseFirstHalf = buffer.reverse().toString();
		boolean symmetric = reverseFirstHalf.contentEquals(secondHalf) ? true : false;
		return symmetric;
}
}
	

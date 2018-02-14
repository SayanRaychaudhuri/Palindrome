import java.util.Arrays;

public class RemovePalindrome {

	public static void main(String[] args) {
		String[] a = {"Hello","lol","Sayan","racecar","Raychaudhuri."};
		System.out.println(Arrays.toString(removePalindromes(a)));
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
		boolean palindrome = reverseFirstHalf.contentEquals(secondHalf) ? true : false;
		return palindrome;
	}
	public static String[] removePalindromes(String[] a){
	    // My older version was simpler. Why did I have to make it fancy!
	    for (int i=0;i<a.length;i++){
	        if (isPalindrome(a[i])) {
	          a[i]=""; 
	        }
	    }
		return a;
	}
}
	

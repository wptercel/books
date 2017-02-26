package methodOfProgramming.c1.a6;

public class Solution_0 extends ASolution {

	public Solution_0(String input) {
		super(input);
	}

	@Override
	public String resolve() {
		int len = input.length();
		if (len == 0) {
			return "";
		}
		
		String result = input.substring(0, 1);

		for (int i = 0; i < len; i++) { // Calculate odd length palindromes
			int leftIndex = i - 1;
			int rightIndex = i + 1;
			while (leftIndex>= 0 && rightIndex  < len) {
				if (isPalindrome(leftIndex, rightIndex)) {
					if (result.length() < rightIndex - leftIndex + 1) {
						result = input.substring(leftIndex, rightIndex + 1);
					}
					leftIndex--;
					rightIndex++;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < len; i++) { // Calculate even length palindrome
			int leftIndex = i;
			int rightIndex = i + 1;
			while(leftIndex >= 0 && rightIndex < len){
				if(isPalindrome(leftIndex, rightIndex)){
					if(result.length() < rightIndex - leftIndex + 1){
						result = input.substring(leftIndex, rightIndex + 1);
					}
					leftIndex--;
					rightIndex++;
				}
				else{
					break;
				}
			}
		}
		return result;
	}

	private boolean isPalindrome(int from, int to) {
		int len = to - from + 1;
		if (len <= 0) {
			return true;
		}
		for (int i = 0; i < len / 2; i++) {
			if (input.charAt(from + i) != input.charAt(to - i)) {
				return false;
			}
		}
		return true;
	}

}

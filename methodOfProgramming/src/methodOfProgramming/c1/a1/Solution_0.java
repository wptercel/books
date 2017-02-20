package methodOfProgramming.c1.a1;

public class Solution_0{
	public static void main(String args[]){
		char[] input = "abcdefg".toCharArray();

		for(int i = 0; i < 3; i++){
			shiftOnePositionToLeft(input);
			System.out.println(input);
		}
		System.out.println(input);
	}

	private static void shiftOnePositionToLeft(char[] array){
		int len = array.length;
		if(len <= 1){
			return;
		}

		char temp = array[0];
		for(int i = 1; i < len; i++){
			array[i - 1] = array[i];
		}
		array[len - 1] = temp;
	}
}
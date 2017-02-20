package methodOfProgramming.c1.a1;

public class Solution_1{
	public static void main(String args[]){
		char[] input = "abcdefg".toCharArray();
		int positions = 3;

		reverse(input, 0, positions);
		System.out.println(input);
		reverse(input, positions, input.length);
		System.out.println(input);
		reverse(input, 0, input.length);
		System.out.println(input);
	}

	private static void reverse(char[] array, int pos1, int pos2){
		if(pos1 >= pos2){
			return;
		}

		int len = pos2 - pos1;

		for(int i = pos1; i < pos1 + len / 2; i++){
			swap(array, i, pos2 - 1 - i + pos1);
		}
	}

	private static void swap(char[]array, int pos1, int pos2){
		char temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}
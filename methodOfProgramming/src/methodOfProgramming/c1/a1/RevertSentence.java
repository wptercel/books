package methodOfProgramming.c1.a1;

public class RevertSentence{
	public static void main(String args[]){
		String input = "King County Public Library System, Bellevue Site";

		char[] inputCharArray = input.toCharArray();
		int len = input.length();
		int tempStart = 0;
		for(int i = 0; i < len; i++){
			if(' ' == input.charAt(i)){
				reverCharArrayFromStartToEnd(inputCharArray, tempStart, i);
				tempStart = i + 1;
			}
		}
		reverCharArrayFromStartToEnd(inputCharArray, tempStart, len);

		reverCharArrayFromStartToEnd(inputCharArray, 0, len);

		String result = new String(inputCharArray);
		System.out.println(input);
		System.out.println(result);
	}

	private static void reverCharArrayFromStartToEnd(char[] sentence, int start, int end){
		int len = end - start;
		if(len <= 1){
			return;
		}

		for(int i=0; i < len / 2; i++){
			swap(sentence, start + i, end - 1 - i);
		}
	}

	private static void swap(char[] array, int pos1, int pos2){
		char temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}
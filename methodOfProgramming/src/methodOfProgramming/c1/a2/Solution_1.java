package methodOfProgramming.c1.a2;

public class Solution_1 extends ASolution{
	public Solution_1(String longString, String shortString){
		super(longString, shortString);
	}

	@Override
	public boolean resolve(){
		long startTime = System.currentTimeMillis();
		char[] longStringChars = longString.toCharArray();
		quickSort(longStringChars);
//		System.out.println(Arrays.toString(longStringChars));
		
		char[] shortStringChars = shortString.toCharArray();
		quickSort(shortStringChars);
//		System.out.println(Arrays.toString(shortStringChars));
		
		for(int si = 0, li = 0; si < shortStringChars.length;){
			while(li < longStringChars.length && shortStringChars[si] > longStringChars[li]){
				li++;
			}
			if(li >= longStringChars.length || shortStringChars[si] < longStringChars[li]){ //Always validate index before using index!!!
				return false;
			}
			si++;
		}
		System.out.println(System.currentTimeMillis() - startTime);
		return true;
	}
	
	private static void quickSort(char[] str){
		quickSortPartition(str, 0, str.length);
	}
	
	private static void quickSortPartition(char[] str, int start, int end){
		int len = end - start;
		if(len <= 1){
			return;
		}
		
		int left = start;
		int right = end - 1;
		char pivot = str[right];
		while(left != right){
			while(str[left] <= pivot && left < right){
				left++;
			}
			str[right] = str[left];
			while(str[right] > pivot && left < right){
				right--;
			}
			str[left] = str[right];
		}
		str[right] = pivot;
		
		quickSortPartition(str, start, right);
		quickSortPartition(str, right + 1, end);
	}
}
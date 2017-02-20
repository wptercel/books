package methodOfProgramming.utils.sorts;

public class QuickSort1 {
	public static void sort(int[] input){
		partition(input, 0, input.length - 1);
	}
	
	private static void partition(int[] unsorted, int start, int end)
    {
		if(start >= end){
			return;
		}
		int low = start;
		int high = end;
        int pivot = unsorted[high];
        while (low < high) // 拉锯式的把大小元素放到pivot的左右两边的空位中
        {
        	while (low < high && unsorted[low] <= pivot){
        		low++;
        	}
        	unsorted[high] = unsorted[low];
        	
            while (low < high && unsorted[high] > pivot){
            	high--;
            }
            unsorted[low] = unsorted[high];
        }
        unsorted[low] = pivot;
        partition(unsorted, start, low - 1);
        partition(unsorted, low + 1, end);
    }
}

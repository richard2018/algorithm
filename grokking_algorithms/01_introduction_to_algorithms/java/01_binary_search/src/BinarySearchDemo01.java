public class BinarySearchDemo01 {
	public static int binarySort(int []list, int item) {
		int low = 0;
		int high = list.length - 1;
		
		while (low <= high) {
			int mid = (low + high)/2;
			int guess = list[mid];
			if (guess == item) {
				return mid;
			} else if (guess > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] myList = {1, 3, 5, 7, 9};

		System.out.println(binarySort(myList, 5)); // 1
	}
}
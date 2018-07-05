
public class BubbleSort {

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 4, 1, 5, 3, 9, 2, 7 };
		System.out.println("Array Before Sorting");
		bubbleSort.printArray(arr);

		bubbleSort.sort(arr);

		System.out.println("Array After Sorting");
		bubbleSort.printArray(arr);
	}

	private void printArray(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private void sort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swapping values to temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

}

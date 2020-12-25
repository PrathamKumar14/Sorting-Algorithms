public class SelectionSort {
    public static void main(String ar[]) {
        int arr[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
	for(int i = 0; i < arr.length; i++) {
		int minIndex = i;
		for(int j = i + 1; j < arr.length; j++) {
			if(arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp; 
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
    }
}

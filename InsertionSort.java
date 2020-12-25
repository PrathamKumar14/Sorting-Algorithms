class InsertionSort {
	public static void main(String ar[]) {
		int[] arr = { 12, 11, 13, 5, 6 };
		for(int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
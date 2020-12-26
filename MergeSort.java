class MergeSort {
	void merge(int arr[], int left, int middle, int right){
		int sizeOfLeftArray = middle - left + 1;
		int sizeOfRightArray = right - middle;
		int leftArray[] = new int[sizeOfLeftArray];
		int rightArray[] = new int[sizeOfRightArray];
		for(int i = 0; i < sizeOfLeftArray; i++){
			leftArray[i] = arr[left + i];
		}
		for(int i = 0; i < sizeOfRightArray; i++){
			rightArray[i] = arr[middle + 1 + i];
		}
		int i = 0;
		int j = 0;
		int k = left;
		while(i < sizeOfLeftArray && j < sizeOfRightArray){
			if(leftArray[i] <= rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i < sizeOfLeftArray){
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		while(j < sizeOfRightArray){
			arr[k] = rightArray[j];
			k++;
			j++;
		}	
	}

	void sort(int arr[], int left, int right){
		if(left < right) {
			int middle = (left + right) / 2;
			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	public static void main(String ar[]) {
		int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
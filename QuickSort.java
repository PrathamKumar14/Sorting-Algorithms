class QuickSort {
	int partition(int arr[], int left, int right){
		int pivot = arr[right];  
        	int i = left - 1;
       		for (int j = left; j < right; j++){ 
            		if (arr[j] < pivot){ 
                		i++;
                		int temp = arr[i]; 
                		arr[i] = arr[j]; 
                		arr[j] = temp; 
            		} 
        	}	 
        	int temp = arr[i+1]; 
        	arr[i+1] = arr[right]; 
        	arr[right] = temp; 
        	return i+1; 
	} 

	void quickSort(int arr[], int left, int right){
		if(left < right){
			int partitioningIndex = partition(arr, left, right);
			quickSort(arr, left, partitioningIndex - 1);
			quickSort(arr, partitioningIndex + 1, right);
		}
	}

	public static void main(String ar[]) {
		int arr[] = {10, 80, 30, 90, 40, 50, 70};
		QuickSort obj = new QuickSort();
		obj.quickSort(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
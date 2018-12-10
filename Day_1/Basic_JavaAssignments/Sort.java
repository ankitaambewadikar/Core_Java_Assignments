import java.util.Scanner;

class Sort{
	
	public static void main(String[] args){
	
	int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int length = array.length;
	System.out.println(length);

	elementSort(array,length);
	printArray(array);
	
	}


	static void elementSort(int arr[],int length){
	       int lengthOne = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int count= 0; count < lengthOne-1; count++) 
        { 
            // Find the minimum element in unsorted array 
            int minimum= count; 
            for (int j = count+1; j < lengthOne; j++) 
                if (arr[j] < arr[minimum]) 
                    minimum = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[minimum]; 
            arr[minimum] = arr[count]; 
            arr[count] = temp; 
        } 

}

	static void printArray(int arr[]){
	int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 

}
}


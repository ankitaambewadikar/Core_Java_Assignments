/*class RemoveDuplicateElement{
	
	public static void main(String[] args){
	
	int array[] = {5,10,2,98,5,8,2,24,10};
	int lengthArray = array.length;

	     
        lengthArray = removeElement(array, lengthArray); 
   
        // Print updated array 
        for (int i=0; i<lengthArray; i++) 
           System.out.print(array[i]+" "); 
	}

	 static int removeElement(int arrayOne[], int lengthArrayOne) {
    							
       		 if (lengthArrayOne == 0 || lengthArrayOne== 1) 
           	 return lengthArrayOne; 
       		 int count = 0; 
       
     
       		 for (int countOne = 0; countOne < lengthArrayOne-1; countOne++) 
            		if (arrayOne[countOne] != arrayOne[countOne+1]) 
               		 arrayOne[count++] = arrayOne[countOne]; 
       
        		arrayOne[count++] = arrayOne[lengthArrayOne-1]; 
       
        		return count; 
    } 
}*/

// simple java program to remove 
// duplicates 
  
class RemoveDuplicateElement 
{ 
    // Function to remove duplicate elements 
    // This function returns new size of modified 
    // array. 
    static int removeDuplicates(int arr[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
       
        // To store index of next unique element 
        int j = 0; 
       
        // Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {5,10,2,98,5,8,2,24,10}; 
        int n = arr.length; 
          
        n = removeDuplicates(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
} 
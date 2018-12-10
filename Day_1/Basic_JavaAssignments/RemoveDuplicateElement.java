class RemoveDuplicateElement{
	
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
}
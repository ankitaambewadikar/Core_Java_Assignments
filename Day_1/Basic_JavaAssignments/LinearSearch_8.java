import java.util.Scanner;

class LinearSearch_8{
	
	public static void main(String[] args){
	
	int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int length = array.length;
	System.out.println(length);

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the element to be searched :");
	 int searchElement = scanner.nextInt();
	elementSearch(array,length,searchElement);
	
	}

	static String elementSearch(int arrayOne[],int length,int searchElement){
			
		int previous = 0;
		if(arrayOne[length-1]==searchElement)
		previous = arrayOne[searchElement-1];
		arrayOne[length-1]=searchElement;
		
		for(int count = 1;;count++){	
			
			if(arrayOne[count]==searchElement){
			arrayOne[length-1]=previous;
				if(count<length-1){
					System.out.println("present");
				}
				else
					System.out.println("not present");
			}
		}
	}
		
	
}



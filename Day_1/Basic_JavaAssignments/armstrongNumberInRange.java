/*
 * Q3. Find the Armstrong numbers  falling in range 100-999 
 */


class ArmstrongNumberInRange {							//main class

	public static void main(String[] args) {		
		
		int remainder,sum,temp,count=100;
		
		
		System.out.println("The armstrong:");
		for( ; count <= 999 ;count++){
			
			sum=0;
			temp=count;
			while (temp > 0) {
				
				remainder = temp % 10;
				 sum = sum + (remainder*remainder*remainder);
				 temp = temp / 10; 
		}
				 
		if(count == sum){
			System.out.println(sum);	 
		 }
				
			
		}

	}
}



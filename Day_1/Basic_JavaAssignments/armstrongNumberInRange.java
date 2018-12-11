/*
 * Q3. Find the Armstrong numbers  falling in range 100-999 
 */


class ArmstrongNumberInRange {							//main class

	public static void main(String[] args) {				//main method static
		
		int remainder,sum,temp,count=100;
		
		
		System.out.println("The armstrong:");
		for( ; count <= 999 ;count++){					//for loop used to check the palindrome numbers in set given 
			
			sum=0;
			temp=count;						//storing the input value taken from user in temp to compare it with present value
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



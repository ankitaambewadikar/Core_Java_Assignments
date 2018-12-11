
public class HelloTest {

	public int addTwoNumbers(int i, int j) {
		
		return i+j;
	}

	public int substractTwoNumbers(int i, int j) {
		
		return i-j;
	}

	public int multiplyTwoNumbers(int i, int j) {
		
		return i*j;
	}

	public int divideTwoNumbers(int i, int j) {
		
		return i/j;
	}

	public int checkArmstrongNumber(int i) {
		
		int number=i,remainder,sum=0,temp;
		temp = number;
		while (number > 0) {
			 remainder=number%10;
			 sum += (remainder*remainder*remainder);
			 number = number/10; 
			
		} 
		if(temp==sum){
			return temp;
			
		}
		else{
			return 0;
		}
		
	}

	public int factorialOfNumber(int i) {
		int factorial = 1 , num = i ;
	    for( int count=1 ; count<=num ; count++ ){
	        factorial = factorial * count;
	    }
		return factorial;
	}

	
}

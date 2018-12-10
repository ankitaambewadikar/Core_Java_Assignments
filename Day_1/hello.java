class HelloOne{
	static void display(){
		System.out.println("Disp");
	
	
	}
	static int add(int numberOne,int numberTwo){
		
		int sum = numberOne + numberTwo;
		return sum;
	}
	static int substract(int numberOne,int numberTwo){
		
		int diff =numberOne-numberTwo;
		return diff;
	}
	static int multiply(int numberOne,int numberTwo){
		int mul = numberOne * numberTwo;
		return mul;
	}
	static float divide(float numberOne,float numberTwo){
		float divide = numberOne / numberTwo;
		return divide;
	}
		

	public static void main(String[] args){
		display();	
		System.out.println("Hello...Welcome to JAVA");
		display();
		int addition =add(10,20);
		System.out.println(addition);
		int sub =substract(10,5);
		System.out.println(sub);
		int mul = multiply(2,9);
		System.out.println(mul);
		float div = divide(50,3);
		System.out.println(div);
	}
}
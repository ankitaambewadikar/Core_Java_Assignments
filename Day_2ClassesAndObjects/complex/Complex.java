/*
 * Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following 
behaviours/services/methods:
void set(float, float) to set the specified value in object
void disp() to display complex number object
complex sum() to sum two complex numbers & return complex number
1. Write the definitions for each of the above member functions.
2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it
 in third object. Display all complex numbers.
 */

package complex;

public class Complex {

	private float real;
	private float imaginary;
	
	public float getReal(){
		return real;
	}
	public float getImaginary(){
		return imaginary;
	}
	
	public void setData(float real,float imaginary){
		
		this.real=real;
		this.imaginary=imaginary;
	}

	public void display() {
		System.out.println(real + "+" + "(" +imaginary +")" + "i");
		
	}


	public Complex sumation(Complex complexOne, Complex complexTwo) {
	
		Complex temp = new Complex();
		temp.real = complexOne.real + complexTwo.real;
		temp.imaginary = complexOne.imaginary + complexTwo.imaginary;
		temp.display();
		return temp;
		
	}

	
}

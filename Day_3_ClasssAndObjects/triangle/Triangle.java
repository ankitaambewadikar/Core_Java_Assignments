/*
 * 
Write a class called Triangle that can be used to represent a triangle. It should include the following methods that return boolean values indicating if the
 particular property holds:

isRight (a right triangle)
isScalene (no two sides are the same length)
isIsosceles (exactly two sides are the same length)
isEquilateral (all three sides are the same length)
Write a simple tester program that creates a few triangles and asks them about their type.

 */

package triangle;

public class Triangle {

	private int sideOne;
	private int sideTwo;
	private int sideThree;

	Triangle(int sideOne, int sideTwo, int sideThree) {
		this.sideOne=sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
		}
	
	public boolean isRightAngleTriangle(){
		
		int largestSide=0;
		if(sideOne > sideTwo && sideOne > sideThree){
			largestSide = sideOne;
			return (largestSide*largestSide == sideTwo*sideTwo + sideThree*sideThree)? true : false;
		}
		
		else if(sideTwo > sideOne && sideTwo > sideThree){
			largestSide = sideTwo;
			return(largestSide*largestSide == sideOne*sideOne + sideThree*sideThree) ? true : false;
		}
		else 
			return(largestSide*largestSide == sideOne*sideOne + sideTwo*sideTwo) ? true : false;
		}
	
	public boolean isScaleneTriangle(){
		if(sideOne != sideTwo && sideOne != sideThree  && sideTwo != sideThree){
			return true;
			
		}
		else
			return false;
		
	}
	public boolean isEquilateralTriangle(){
		if(sideOne == sideTwo && sideTwo == sideThree && sideOne == sideThree){
			return true;
		}
		else 
			return false;
		
	}
	public boolean isIsocelesTriangle(){
		if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree){
			return true;
		}
		else 
			return false;
		
	}
		
		
}
	



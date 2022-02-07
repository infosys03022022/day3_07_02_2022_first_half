package infosys.demo.operators;

public class Demo2 {

	public static void main(String[] args) {
		
			int numOne = 15;
			int numTwo = 5;
			           // boolean expressiom
			           // numOne==numTwo
			// numOne!=numTwo
			          // We cannot write numOne+numTwo ==> it is not returning any boolean values as result
			int min = (numOne < numTwo) ? numOne : numTwo;  //5
			System.out.println(min); //Output will be 5
			System.out.println((numOne > numTwo) ? numOne : numTwo); //15
		}


	}



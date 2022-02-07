package infosys.demo.controlstructureif;

public class Demo5 {

	// Display the largest number out of two
	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		int max=0;
		// so storing it in a max variable
		// we are having the advantage as twice or 
		// thrice we don't have to write 
		// System.out.println();
		// within if and else block we are just
		// assigning the value of maximum value 
		// is stored in max
		
	/*	if(num1>num2)
		{
			//System.out.println(num1);
		    max=num1;
		}
		else
		{
			//System.out.println(num2);
	        max=num2;
		}
	
	    System.out.println(max); */
		max=(num1>num2)?num1:num2;
		System.out.println(max);

	}

}

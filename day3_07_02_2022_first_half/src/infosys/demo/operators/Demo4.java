package infosys.demo.operators;

public class Demo4 {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		int num3=2;
		
		// num1/num2=====> 2
		//   2+num3 =====   4
		int result=num1/num2+num3;
		System.out.println(result); // 4
		//   num1/7
		//   10/7  ===> 1
		result=num1/(num2+num3); 
		System.out.println(result);
	}

}

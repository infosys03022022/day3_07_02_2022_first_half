package infosys.demo.operators;

public class Demo1 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int num3=10;
		int num4=20;
		                     // true  &&  true    ===> true
		System.out.println(num1==num3 && num2==num4);
		boolean b=num1==num3 && num2==num4;
        System.out.println(b);
        // for || (or) if the first condition is true
        // it wont go for checking the operation 
        // which is on the RHS of ||
                        //      true         true  ==> true
        System.out.println(num1==num3 || num2==num4);
                        // false             true ===> true
        System.out.println(num1==num2 || num2==num4);
		
	}

}

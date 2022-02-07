package infosys.demo.conversion;

public class Demo1 {

	public static void main(String[] args) {
	  int num=1;
	  float f=12.45f;
	  double d=12.46;
	  
	  // What will happen if we are writing float f=12.45?
	  // 12.45 is considered as double value 
	  // and a double value cannot be assigned to float
	  // because double is having larger byte size than float
	  // f/F ensures the value is float
	  
	  // In the following expression
	  // num is converted into float and the binary operation +
	  // takes place
	  float store=num+f;  
	  System.out.println(store);
	  double store2=num+d;
	  // int num will be first converted to double and
	  // then the arithmetic operation add will take place
	  System.out.println(store2);
	}

}

package infosys.demo.conversion;

public class Demo3 {

	public static void main(String[] args) {
		double d=12.34;
		long num=0;
        // The following line gives a compilation error
		// because double is having bigger size in comparison
		// to int data type
		//num=d;
// So the following line is fine as being a coder
	// we are saying or assuring that we know what we 
	// are doing and in this process if the data is
	// truncated it is fine for me
		//num=d;
		System.out.println(num);
	}

}

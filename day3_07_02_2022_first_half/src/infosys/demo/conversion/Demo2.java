package infosys.demo.conversion;

public class Demo2 {

	public static void main(String[] args) {
		double d=12.34;
		int num=9;
		System.out.println(d); //12.34
		System.out.println(num);  // 9
		// as double is having a bigger size than num
		// so num can be assigned to double and
		// it is called conversion and it is similar
		// to just putting the content of smaller jug
		// into the bigger jug
		d=num;
		System.out.println(d);   // 9.0
		System.out.println(num);  // 9

	}

}

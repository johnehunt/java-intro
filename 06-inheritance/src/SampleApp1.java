
public class SampleApp1 {

	public static void main(String[] args) {
		Employee e = new Employee("John", 55, 1234);
		Sales s = new Sales("Adam", 20, 3456);
		System.out.println(e.calculatePay(40));
		System.out.println(s.calculatePay(40));
		e = s;
		System.out.println(e.calculatePay(40));
	}

}

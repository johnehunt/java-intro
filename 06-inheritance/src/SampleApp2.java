
public class SampleApp2 {

	public static void main(String[] args) {
		Employee e = new Employee("John", 55, 1234);
		Sales s = new Sales("Adam", 20, 3456);
		e = s;
		System.out.println(e);
		s = (Sales)e;
		System.out.println(s);
	}

}

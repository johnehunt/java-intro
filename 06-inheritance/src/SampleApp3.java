
public class SampleApp3 {

	public static void main(String[] args) {
		Employee e = new Employee("John", 55, 1234);
		Developer d = new Developer("Eloise", 25, 5432);
		Sales s = new Sales("Adam", 20, 3456);
        e = d;
        e = s;
        
//        d = s;
//        s = d;
        
        d = (Developer)e;
	}

}

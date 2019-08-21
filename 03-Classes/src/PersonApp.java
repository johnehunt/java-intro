
public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("John", 54);
		System.out.println(p);
		
		System.out.println(p.getName() + " is " + p.getAge());
		p.setAge(55);
		System.out.println(p.getName() + " is " + p.getAge());
		
		System.out.println(p);
		
		Person p1 = new Person("John", 55);
		Person p2 = new Person("Denise", 52);
		Person p3 = new Person("Phoebe", 22);
		Person p4 = new Person("Adam", 20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}

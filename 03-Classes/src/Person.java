
public class Person {

	// instance variables
	private int age;
	private String name;

	// a constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this(name, 0);
	}

	public Person() {
		this("John");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("Person [age=%s, name=%s]", age, name);
	}

}

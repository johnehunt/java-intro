
public final class Student {

	private String name;
	private int age;
	private String subject;
	private int result;

	public final int year = 2020;

	public Student(String name, int age, String subject, int result) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public final void prettyPrint() {
		System.out.println("Student(" + name + ", age: " + age + " studying" + subject + " with " + result);
	}

	public void setAge(final int newAge) {
		this.age = newAge;
	}

	public String calculateStatus() {
		final int max = 100;
		if (result > 0 && result < max) {
			if (result < 50) {
				return "Fail";
			}
		}
		return "Pass";
	}

}

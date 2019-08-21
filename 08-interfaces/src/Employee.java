public class Employee implements Speaker, Translator{
	public void saySomething() {
		System.out.println("Employee- Say Something");
    }
	public void sayHello() {
		Speaker.super.sayHello();
	}
}

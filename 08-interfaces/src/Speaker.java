public interface Speaker {
	
	public void saySomething();
	
	default public void sayHello() {
		System.out.println("Speaker - Hello World");
	}
}

public interface Printer {
	
	void prettyPrint();
	
	static void printMe() {
		System.out.println("Printer - printMe");
	}
	
}

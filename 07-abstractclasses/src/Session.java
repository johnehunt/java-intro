
public class Session {
	
	private static Session singleton;
	
	public static Session getInstance() {
		if (singleton == null) {
			singleton = new Session();
		}
		return singleton;
	}
	
	private Session() { }

}

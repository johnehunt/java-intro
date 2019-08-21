
public class Calendar implements Organizer {

	@Override
	public void add(String appointment, String date) {
		System.out.println(appointment + " - " + date);
	}

	@Override
	public String get(String date) {
		return null;
	}

	@Override
	public boolean remove(String date) {
		return false;
	}

}

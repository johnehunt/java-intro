
public class CompassDirectionsApp {

	public static void main(String[] args) {
		CompassDirections[] directions = CompassDirections.values();
		System.out.println(directions.length);

		CompassDirections d = CompassDirections.WEST;
		switch (d) {
		case WEST:
			System.out.println("Heading " + d.getBearing());
			break;
		default:
			System.out.println("Unknown heading");
		}

	}

}

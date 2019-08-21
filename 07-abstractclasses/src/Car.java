public class Car extends Conveyance {

	@Override
	public void consumeFuel() {
		fuel = fuel - 0.5;
		System.out.println("consuming, ");
	}

}

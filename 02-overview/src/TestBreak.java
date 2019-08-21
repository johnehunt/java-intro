public class TestBreak {

	public static void main(String[] args) {
		int y = 10, x = 5;
		loop: for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (i == x) {
					break loop;
				}
				System.out.println(i + "\t" + j);
			}
		}
	}

}


public class ConciseSwitchExample {

	public static void main(String[] args) {
		String month = "AUG";
	    int i = switch (month){
	        case "JAN","JUN", "JUL" -> 3;
	        case "FEB","SEP", "OCT", "NOV", "DEC" -> 1;
	        case "MAR","MAY", "APR", "AUG" -> {
	            int j = month.toString().length() * 4;
	            break j;
	        }
		default -> 0;
	    };
	    System.out.println(i); //12
	}

}

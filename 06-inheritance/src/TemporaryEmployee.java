import java.util.Date;

public class TemporaryEmployee extends Employee {

	private String startDate = "";
	private int periodOfContract = 6;

	public TemporaryEmployee(String n, int a, int id) {
		super(n, a, id);
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getPeriodOfContract() {
		return periodOfContract;
	}

	public void setPeriodOfContract(int periodOfContract) {
		this.periodOfContract = periodOfContract;
	}

}

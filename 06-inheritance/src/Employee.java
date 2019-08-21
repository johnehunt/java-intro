public class Employee extends Person {
    private int id;
    private int empNumber;
    private double hourlyRate = 24.00;
    
    public Employee(String n, int a, int id) {
        super(n, a);
        this.setId(id);
    }
    
    public double calculatePay(int hours) {
        return getHourlyRate() * hours;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getEmpNumber() {
        return empNumber;
    }
    
    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public void sayHello() {
    	System.out.println("Welcome");
    	super.sayHello();
    	System.out.println("Hi");
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}

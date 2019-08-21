public class Manager extends PerminantEmployee {
    
    public Manager(String n, int a, int id) {
        super(n, a, id);
    }
    
    public void printPay() {
        System.out.println(calculatePay(40));
    }
    
}

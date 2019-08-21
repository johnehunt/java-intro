
public class Sales  extends PerminantEmployee {
    
    private double bonus = 200.0;
    
    public Sales (String n, int a, int id) {
        super(n, a, id);
    }
    
    public double calculatePay(int hours) {
        return super.calculatePay(hours) + bonus;
    }
}

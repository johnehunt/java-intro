public abstract class Conveyance {
	
	protected double fuel = 5.0;
    private boolean running;
    
    public void startup() {
    	this.running = true;
    	this.consumeFuel();
    	while (this.fuel > 0) {
    		this.consumeFuel();
    	}
    	this.running = false;
    }
	
    public abstract void consumeFuel();
}
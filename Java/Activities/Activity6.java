package Activities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Plane{
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTakeoff;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<String>();
    }
    
    public void onboard(String passengerName) {
        this.passengers.add(passengerName);
    }
    
    public void setTakeOff() {
    	this.lastTimeTakeoff = new Date();
    }
    
    public Date getTakeOffTime() {
    	return this.lastTimeTakeoff;
    }

    public void setLand() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return this.lastTimeLanded;
    }

    public List<String> getPassengers() {
        return this.passengers;
    }
}






public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		//Create object
		Plane b746 = new Plane(10);
		b746.onboard("Tara");
		b746.onboard("Rani");
		
		b746.setTakeOff();
		System.out.println("The plane took off at " + b746.getTakeOffTime());
		System.out.println("Passengers in the plane:" + b746.getPassengers());
		
		//flying
		System.out.println("Plane is flying...");
		Thread.sleep(5000);
		
		
		//set the landing time
		b746.setLand();
		System.out.println("Plane landed at: "+  b746.getLastTimeLanded());
		System.out.println("The passengers in the plane after landing:"+ b746.getPassengers());
		

	}

}

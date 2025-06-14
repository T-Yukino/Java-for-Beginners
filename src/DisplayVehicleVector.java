import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,-5,0));
		vehicles.add(new Train(10,180,7,0));
		vehicles.add(new Train(10,260,-4,0));
		vehicles.add(new Truck(10,320,2,0));
		vehicles.add(new Truck(10,380,6,0));
		
		while(true) {
		for(int i=0; i<30; i++) {
			clear();
			
			for(int j=0; j<vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move(this);
			}
			sleep(0.01);
		}
		}
	}

}

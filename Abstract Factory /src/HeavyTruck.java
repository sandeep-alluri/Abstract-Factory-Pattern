
public class HeavyTruck extends TruckAbstractFactory {

	public HeavyTruck(TruckType truckTypeModel, Location location) {
		super(truckTypeModel.HEAVY, location);
		 buildTruck();
	}
@Override
	public void buildTruck() {
		System.out.println("Building heavy truck");
		
	}

}

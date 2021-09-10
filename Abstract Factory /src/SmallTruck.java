
public class SmallTruck extends TruckAbstractFactory {

	public SmallTruck(TruckType truckTypeModel, Location location) {
		super(truckTypeModel.SMALL, location);
		buildTruck();
	}

	@Override
	public void buildTruck() {
		 System.out.println("Building small truck");
		
	}
	 

}

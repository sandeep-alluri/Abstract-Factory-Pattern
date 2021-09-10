
public class MediumTruck extends TruckAbstractFactory{

	public MediumTruck(TruckType truckTypeModel, Location location) {
		super(truckTypeModel.MEDIUM, location);
		
		buildTruck();
		 
	}
@Override
	public void buildTruck() {
		 
		System.out.println("Building medium truck");
	}

}

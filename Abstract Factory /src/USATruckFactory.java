
public class USATruckFactory {
	
	public static TruckAbstractFactory buildTruck(TruckType truckModel) {
		

		 
		if(truckModel.equals(TruckType.SMALL)) {
 	
			return new SmallTruck(TruckType.SMALL, Location.USA);
			
		} else if(truckModel.equals(TruckType.MEDIUM)) {
			return new MediumTruck(TruckType.MEDIUM, Location.USA);
		} else if(truckModel.equals(TruckType.HEAVY)) {
			return new HeavyTruck(TruckType.HEAVY, Location.USA);
		}else {
			System.out.println("Truck model not matched in USA");
			return null; 
		}
 
	  
		
	}

}

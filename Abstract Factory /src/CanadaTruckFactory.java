
public class CanadaTruckFactory {
	
	public static TruckAbstractFactory buildTruck(TruckType truckModel) {
		

		 
		if(truckModel.equals(TruckType.SMALL)) {
 	
			return new SmallTruck(TruckType.SMALL, Location.CANADA);
			
		} else if(truckModel.equals(TruckType.MEDIUM)) {
			return new MediumTruck(TruckType.MEDIUM, Location.CANADA);
		} else if(truckModel.equals(TruckType.HEAVY)) {
			return new HeavyTruck(TruckType.HEAVY, Location.CANADA);
		}else {
			System.out.println("Truck model not matched in Canada");
			return null; 
		}
 
	  
		
	}

}

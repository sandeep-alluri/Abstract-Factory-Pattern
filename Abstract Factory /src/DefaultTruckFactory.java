
public class DefaultTruckFactory {
	
 
	public static TruckAbstractFactory buildTruck(TruckType model)
	  {
		 
		if(model.equals(TruckType.SMALL)) {
 	
			return new SmallTruck(TruckType.SMALL, Location.DEFAULT);
			
		} else if(model.equals(TruckType.MEDIUM)) {
			return new MediumTruck(TruckType.MEDIUM, Location.DEFAULT);
		} else if(model.equals(TruckType.HEAVY)) {
			return new HeavyTruck(TruckType.HEAVY, Location.DEFAULT);
		}else {
			System.out.println("Truck model not matched");
			return null; 
		}
 
	  }

	 
	}
	 

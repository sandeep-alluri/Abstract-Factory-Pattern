
public class TruckFactory {
	
	 public static TruckAbstractFactory buildTruck(TruckType type,Location location)
	    {
		 TruckAbstractFactory truck = null;
 
	          
	        switch(location)
	        {
	            case USA:
	            	truck = USATruckFactory.buildTruck(type);
	                break;
	                  
	            case CANADA:
	            	truck = CanadaTruckFactory.buildTruck(type);
	                break;
	                      
	            default:
	                truck = DefaultTruckFactory.buildTruck(type);
	  
	        }
	          
	        return truck;
	  
	    }
	

}

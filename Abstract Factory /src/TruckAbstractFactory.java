
public abstract class TruckAbstractFactory {
	
	public Location location = null;
	
	public TruckType truckType = null;
	
	abstract void buildTruck();
	
	
	public TruckAbstractFactory(TruckType truckTypeModel, Location location){
	    this.truckType = truckTypeModel;
	    this.location = location;
	  }

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public TruckType getTruckType() {
		return truckType;
	}

	public void setTruckType(TruckType truckType) {
		this.truckType = truckType;
	}
	
	
	 @Override
	  public String toString() {
	    return "TruckType Model - "+truckType + " built in "+location;
	  }
	
	

}

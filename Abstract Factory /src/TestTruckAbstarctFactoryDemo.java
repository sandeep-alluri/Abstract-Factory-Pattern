
public class TestTruckAbstarctFactoryDemo {

	public static void main(String[] args) {
		 
		 System.out.println(TruckFactory.buildTruck(TruckType.HEAVY, Location.USA) );
		 System.out.println(TruckFactory.buildTruck(TruckType.MEDIUM, Location.CANADA) );
		 System.out.println(TruckFactory.buildTruck(TruckType.SMALL, Location.DEFAULT) );
	}

}

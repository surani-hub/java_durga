class VehicleType{
	interface Vehicle{
		public int getWheels();
	}
	
	class Bus implements Vehicle{
		public int getWheels(){
			return 6;
		}
	}
	
	class Auto implements Vehicle{
		public int getWheels(){
			return 4;
		}
	}
	
	public static void main(String[] args){
		VehicleType.Bus bus = new VehicleType().new Bus();
		System.out.println(bus.getWheels());
		
		VehicleType.Auto auto = new VehicleType().new Auto();
		System.out.println(auto.getWheels());
		
		
	}
}
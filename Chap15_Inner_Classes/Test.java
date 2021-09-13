class Test{
	public static void main(String[] args){
		BusClass b = new BusClass();
		System.out.println(b.getWheels()); // 6
		
		VehicleInterface.DefaultVehicle d = new VehicleInterface.DefaultVehicle();
		System.out.println(d.getWheels()); // 3
	}
}
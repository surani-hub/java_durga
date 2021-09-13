interface VehicleInterface{
	public int getWheels();
	
	class DefaultVehicle implements VehicleInterface{
		public int getWheels(){
			return 3;
		}
	}
}
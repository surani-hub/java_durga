public class TestingColors{
	public static void main(String[] args){
		Color[] colors = Color.values();
		
		for(Color color: colors){
			color.info();
		}
	}
}
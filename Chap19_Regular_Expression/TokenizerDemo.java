import java.util.StringTokenizer;

class TokenizerDemo{
	public static void main(String[] args){
		//StringTokenizer st = new StringTokenizer("This is a beautiful life!");
		StringTokenizer st = new StringTokenizer("This is a beautiful life!", "i");
		//StringTokenizer st = new StringTokenizer("This is a beautiful life!", "i", false);
		
		/*
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		*/
		
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
	}
}
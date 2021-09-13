 strictfp enum Beer{
	KF, KO, RC, FO;
}

public class Test{
	public static void main(String[] args){
		Beer b1 = Beer.KF;
		System.out.println(b1);
		
		Beer b2 = Beer.RC;
		switch(b2){
			case KF: System.out.println("king fisher");
					 break;	
			case KO: System.out.println("coco cola");
					 break;
			case RC: System.out.println("royal");
					 break;
			case FO: System.out.println("famous");
					 break;
		//	case KALYANI: System.out.println("duplicate");
			//		 break;
			default: System.out.println("default taste");
		}
	}
}
class TestStringBuffer{
	public static void main(String[] args){
		
		StringBuffer sbuf = new StringBuffer("ashok kumar");
		System.out.println(sbuf);
		System.out.println(sbuf.capacity());
		sbuf.setLength(6);
		System.out.println(sbuf);
		System.out.println(sbuf.capacity());
		
		sbuf = new StringBuffer(1000);
		System.out.println(sbuf.capacity());
		sbuf.append("ashok");
		System.out.println(sbuf.capacity());
		sbuf.trimToSize();
		System.out.println(sbuf.capacity());
		
		
		sbuf = new StringBuffer();
		System.out.println(sbuf.capacity());
		sbuf.ensureCapacity(100);
		System.out.println(sbuf.capacity());
		
		/*
		StringBuffer sb = new StringBuffer(null);
		System.out.println(sb);
		*/
		
		/*
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity()); // 16
		sb1.append("abcdefghijkmaliow");
		System.out.println(sb1.capacity()); // 34
		
		StringBuffer sb2 = new StringBuffer(19);
		System.out.println(sb2.capacity()); // 19
		
		StringBuffer sb3 = new StringBuffer("ashok");
		System.out.println(sb3.capacity()); // 21
		
		System.out.println("--------------------------------------------------");
		
		StringBuffer strb = new StringBuffer("saiashokkumarreddy");
		System.out.println(strb.length());
		System.out.println(strb.capacity());
		System.out.println(strb.charAt(14));
		// System.out.println(strb.charAt(30));
		
		strb.setCharAt(11,'A');
		System.out.println(strb);
		
		strb.insert(11,9);
		System.out.println(strb);
		
		strb.insert(13, 3.14233);
		System.out.println(strb);
		
		strb.delete(0,8);
		System.out.println(strb);
		
		strb.deleteCharAt(3);
		System.out.println(strb);
		
		System.out.println(strb.reverse());
		*/
		
	}
}
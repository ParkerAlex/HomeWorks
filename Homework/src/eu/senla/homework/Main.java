package eu.senla.homework;

public class Main {

	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static boolean h;

	static Byte aByte;
	static Short bShort;
	static Integer cInteger; 
	static Long dLong;
	static Float eFloat;
	static Double fDouble;
	static Character gCharacter;
	static Boolean hBoolean;

	public static void main(String[] args) {
 
		
		Number number = new Number();

		number.setA((byte) 100);
		byte a = number.getA();
		System.out.println("byte a = " + a);

		byte m = a;
		System.out.println("byte m = " + m);

		number.setB((short) 300);
		short b = number.getB();
		System.out.println("short b = " + number.getB());

		int n = b;
		System.out.println("int n = " + n);

		float mn = m + n;
		System.out.println("float mn = " + mn);

		number.setF((double) 3333.333);
		float u = (float)number.getF();
		System.out.println("float u = " + u);
		
		long z = (long)mn + (long)u;
	    System.out.println("long z = " + z);
		  
	    number.setH((boolean) true);
		boolean h = number.getH();
		System.out.println("boolean h = " + h);
		
		boolean hx = h && false;
		System.out.println("boolean hx = " + hx);
		
		Integer xy = 200;
		Integer xz = 200;
		Boolean xyz = xy == xz;
		Boolean xzy = xy.equals(xz);
		System.out.println("boolean xy == xz = " + xyz);
		System.out.println("boolean xy  xz = " + xzy);
		  
		
        number.setL((String) "DOG_");
		String l = number.getL();
		System.out.println("String l = " + l);


		number.setG((char) 'J');
		char g = number.getG();
		System.out.println("char G = " + g);
			
	    String lg = l + g + 'i' + "mi";
	    System.out.println("String lg = " + lg);
		 
	}

}
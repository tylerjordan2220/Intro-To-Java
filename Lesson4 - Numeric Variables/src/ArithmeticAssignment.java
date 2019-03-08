import org.omg.CORBA.SystemException;

public class ArithmeticAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xx = "79 + 3 * (4+82-68) - 7 +19";
		int x =79; int y = 3*(4+82-68); int z =-7; int e = +19;
		System.out.println( xx+ " "+"="+ " " +(x+y+z+e));
		String aa = "(179 +21 +10)/7 + 181";
		int a = 179; int b = 21; int c = 10; int d =181; int j = 7;
		System.out.println(aa+ " "+ "="+" " +(((a+b+c))/j+d));
		String gg = "10389 * 56 * 11 + 2246";
		int g = 10389; int h =56; int k = 11; int l = 2246;
		System.out.println(gg+" "+"="+" "+((g*h*k)+l));
		
		
		
		
		
		
		
	}

}

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.CORBA.SystemException;

public class CastingandConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((double)(95/9));
		System.out.println(6.0/4);
		
		
		double d = 13.25;
		int i =12;
		int j = (int)d/i;
		System.out.println(j);
		
		
		
		int k = 7;
		k*=5;
		System.out.println(k);
		
		
		double d1= 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 =18;
		
		System.out.println(57.2*(i1/i2)+1);
		System.out.println(57.2*(double)i1/i2+1);
		System.out.println(15-i1*(d1*3)+4);
		System.out.println(14-i1*(int)(d1*3)+4);
		System.out.println();
		
		
		
	}

}

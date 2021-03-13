package typeCast;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		
		char a = 'A';
		
		int i1 = a;
		float f1 = a;
		double d1 = a;
		
		System.out.println("implicit typecast, int " + i1);
		System.out.println("implicit typecast, float " + f1);
		System.out.println("implicit typecast, double " + d1);		
		
		double d2 = 15.123;
		int i2 = (int) d2;
		
		System.out.println("explicit typecast, int " + i2);					
	
	}
	


}

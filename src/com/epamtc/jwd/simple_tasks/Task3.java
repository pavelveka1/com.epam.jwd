package com.epamtc.jwd.simple_tasks;
/*
Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
 и заменить их абсолютными значениями, если это не так.
*/
public class Task3 {
	
	public static void convertNumbers(double a, double b, double c) {
		if(a>b && b>c) {
			System.out.println("a = "+a*2+", b = "+b*2+", c = "+c*2);
		}else {
			System.out.println("a = "+Math.abs(a)+", b = "+Math.abs(b)+", c = "+Math.abs(c));
		}
		
	}

}

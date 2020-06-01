package com.epam.jwd.simple_tasks;

/*
 ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х).
  ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task7 {

	public static double swapIntegerAndFractional(double n) {

		int m = (int) n;
		n = n * 1000;
		n = n % (m * 1000);
		double k = (double) m / 1000;
		return n + k;
	}

}

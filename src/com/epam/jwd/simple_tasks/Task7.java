package com.epam.jwd.simple_tasks;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 Поменять местами дробную и целую части числа и вывести полученное значение числа.

Примечание: для решения этой нельзя использовать перевод числа в строку и обратно
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

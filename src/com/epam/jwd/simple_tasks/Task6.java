package com.epam.jwd.simple_tasks;

/*
Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
 Даны a1 и d (шаг арифметической прогрессии). 
 Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
 */
public class Task6 {

	public static int calculateIterationOutOfRangeInteger(int a1, int step) {
		int sum = 0;
		int n = 1;
		while ((Integer.MAX_VALUE - sum) > (a1 + step * (n - 1))) {
			sum = (a1 + a1 + step * n) * (n / 2);
			n++;
		}
		return ++n;
	}

	public static long calculateIterationOutOfRangeLong(long a1, long step) {
		long sum = 0;
		long n = 1;
		while ((Long.MAX_VALUE - sum) > (a1 + step * (n - 1))) {
			sum = (a1 + a1 + step * n) * (n / 2);
			n++;
		}
		return ++n;
	}
}

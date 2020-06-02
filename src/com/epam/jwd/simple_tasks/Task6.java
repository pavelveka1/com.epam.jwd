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
		int nextValue = 0;

		while (true) {
			nextValue = a1 + step * (n - 1);

			if (nextValue < 0) {
				if ((Integer.MIN_VALUE + Math.abs(sum)) < nextValue) {
					sum = (a1 + a1 + step * (n - 1)) * (n / 2);
					n++;
				} else {
					return ++n;
				}
			} else {
				if ((Integer.MAX_VALUE - Math.abs(sum)) >= nextValue) {
					sum = (a1 + a1 + step * (n - 1)) * (n / 2);
					n++;
				} else {
					return ++n;
				}
			}
		}
	}

	public static long calculateIterationOutOfRangeLong(long a1, long step) {
		long sum = 0;
		long n = 1;
		long nextValue = 0;

		while (true) {
			nextValue = a1 + step * (n - 1);

			if (nextValue < 0) {

				if ((Long.MIN_VALUE + Math.abs(sum)) < nextValue) {
					sum = (a1 + a1 + step * (n - 1)) * (n / 2);
					n++;
				} else {
					return ++n;
				}
			} else {
				if ((Long.MAX_VALUE - Math.abs(sum)) >= nextValue) {
					sum = (a1 + a1 + step * (n - 1)) * (n / 2);
					n++;
				} else {
					return ++n;
				}
			}
		}
	}
}

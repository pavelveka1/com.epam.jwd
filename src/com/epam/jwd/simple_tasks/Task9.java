package com.epam.jwd.simple_tasks;

/*
 Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
 */
public class Task9 {
	
	public static long calculate() {
		int n = 1;
		long s = 1;
		for (int i = 2; i <= 10; i++) {
			n = n + i;
			s = s * n;
		}
		return s;
	}
}

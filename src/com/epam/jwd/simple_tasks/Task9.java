package com.epam.jwd.simple_tasks;

/*
 * Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
 */
public class Task9 {

	public static void main(String[] args) {
		
		System.out.println(Task9.calculate());

	}
public static double calculate() {
	int n=1;
	double s=1;
	for(int i=2;i<=10;i++) {
		n=n+i;
		s=s*n;
	}
	return s;
}
}

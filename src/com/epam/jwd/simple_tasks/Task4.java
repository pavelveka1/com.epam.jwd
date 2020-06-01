package com.epam.jwd.simple_tasks;
//Вычислить значение функции:
public class Task4 {

	public static double calculateFunction(double x) {
		double result=0;
		if(x<=13) {
			result=-Math.pow(x, 3)+9;
		}else {
			result=-3/(x+1);
		}
		return ((double)((int)(result*1000)))/1000;
	}
}

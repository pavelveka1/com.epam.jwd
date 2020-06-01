package com.epam.jwd.simple_tasks;
//Вычислить значение функции
public class Task4 {

	public static void main(String[] args) {

		System.out.println(Task4.calculateFunctions(13));
	}
	public static double calculateFunctions(double x) {
		double result=0;
		if(x<=13) {
			result=-Math.pow(x, 3)+9;
		}else {
			result=-3/(x+1);
		}
		return ((double)((int)(result*1000)))/1000;
	}
}

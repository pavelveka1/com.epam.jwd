package com.epam.jwd.simple_tasks;

/**
 * Вычислить значение выражения по формуле : ((𝑏 + √(𝑏^2 + 4𝑎𝑐)) / 2𝑎) −
 * (𝑎^3)*𝑐 + 𝑏^(−2)
 */
public class Task1 {


	public static double calculate(double a, double b, double c) {
		double result = 0;
		// вычислим некоторые части выражения и присвоим их переменным x, y, z
		double x = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		double y = Math.pow(a, 3) * c;
		double z = Math.pow(b, -2);
		// вычисляем общее выражение
		result = (b + x) / (2 * a) - y + z;

		return result;
	}
}

package com.epam.jwd.simple_tasks;
//Вычислите число и месяц в невисокосном году по номеру дня.
public class Task2 {
	
	private static int[] numberDaysInManths = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static void getDayAndManth(int numberOfDay) {
		if (numberOfDay > 365 || numberOfDay < 1) {
			System.out.println("Day number must be in the range 1-365");
		} else {
			for (int i = 1; i <= 12; i++) {
				if (numberOfDay <= numberDaysInManths[i-1]) {
					System.out.println("Day = " + numberOfDay + ", Manth = " + i);
					return;
				} else {
					numberOfDay = numberOfDay - numberDaysInManths[i-1];
				}
			}

		}
	}

}

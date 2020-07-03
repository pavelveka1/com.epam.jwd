package com.epam.jwd.simple_tasks;

//Вычислите число и месяц в невисокосном году по номеру дня.
public class Task2 {

	public static String toDayAndManth(int numberOfDayInYear) {
		int day = 0;
		int manth = 1;
		if (numberOfDayInYear > 365 || numberOfDayInYear < 1) {
			return "Day number must be in the range 1-365";
		} else {
			for (; manth <= 12; manth++) {
				switch (manth) {
				case 1, 3, 5, 7, 8, 10, 12:
					if (numberOfDayInYear <= 31) {
						day = numberOfDayInYear;
						return "Day = " + day + ", Manth = " + manth;
					} else {
						numberOfDayInYear = numberOfDayInYear - 31;
					}
					break;

				case 2:
					if (numberOfDayInYear <= 28) {
						day = numberOfDayInYear;
						return "Day = " + day + ", Manth = " + manth;
					} else {
						numberOfDayInYear = numberOfDayInYear - 28;
					}
					break;

				case 4, 6, 9, 11:

					if (numberOfDayInYear <= 30) {
						day = numberOfDayInYear;
						return "Day = " + day + ", Manth = " + manth;
					} else {
						numberOfDayInYear = numberOfDayInYear - 30;
					}
					break;
				}
			}
		}
		return "Day = " + day + ", Manth = " + manth;
	}
}

package com.epam.jwd.simple_tasks;

/*
Дано трехзначное число. Определите:

сумму и произведение цифр числа;
число, полученное перестановкой цифр сотен и десятков;
четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч 
(например, из числа 137 необходимо получить число 7137).
Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.
 */
public class Task5 {

	private static int units = 0;
	private static int dozens = 0;
	private static int hundreds = 0;
	private static int[] arrayOfDigits = new int[3];

	private static int[] toArrayOfDigits(int x) {
		units = x % 10;
		x = x / 10;
		dozens = x % 10;
		hundreds = x / 10;
		return new int[] { units, dozens, hundreds };
	}

	public static int summarizeDigits(int x) {
		if (x < 1000) {
			arrayOfDigits = Task5.toArrayOfDigits(x);
			return arrayOfDigits[0] + arrayOfDigits[1] + arrayOfDigits[2];
		}
		return -1;
	}

	public static int multiplyDigits(int x) {
		if (x < 1000) {
			arrayOfDigits = Task5.toArrayOfDigits(x);
			return arrayOfDigits[0] * arrayOfDigits[1] * arrayOfDigits[2];
		}
		return -1;
	}

	public static int swapDozensAndHundreds(int x) {
		if (x < 1000) {
			arrayOfDigits = Task5.toArrayOfDigits(x);
			dozens = arrayOfDigits[2];
			hundreds = arrayOfDigits[1];
			return arrayOfDigits[0] + dozens * 10 + hundreds * 100;
		}
		return -1;
	}

	public static int convertToFourDigits(int x) {
		if (x < 1000) {
			arrayOfDigits = Task5.toArrayOfDigits(x);
			int thousand = arrayOfDigits[0] * 1000;
			return thousand + x;
		}
		return -1;
	}

}

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
	
	private int units = 0;
	private int dozens = 0;
	private int hundreds = 0;
	private int[] arrayOfDigits = new int[3];

	public static void main(String[] args) {
		Task5 test=new Task5();
		System.out.println(test.summarizeDigits(137));
		System.out.println(test.multiplyDigits(137));
		System.out.println(test.swapDozensAndHundreds(137));
		System.out.println(test.convertToFourDigits(137));
		

	}

	private int[] digits(int x) {
		units = x % 10;
		x = x / 10;
		dozens = x % 10;
		hundreds = x / 10;
		return new int[] { units, dozens, hundreds };
	}

	public int summarizeDigits(int x) {
		if (x < 1000) {
			arrayOfDigits = this.digits(x);
			return arrayOfDigits[0] + arrayOfDigits[1] + arrayOfDigits[2];
		}
		return -1;
	}

	public int multiplyDigits(int x) {
		if (x < 1000) {
			arrayOfDigits = this.digits(x);
			return arrayOfDigits[0] * arrayOfDigits[1] * arrayOfDigits[2];
		}
		return -1;
	}

	public int swapDozensAndHundreds(int x) {
		if (x < 1000) {
			arrayOfDigits = this.digits(x);
			dozens = arrayOfDigits[2];
			hundreds = arrayOfDigits[1];
			return arrayOfDigits[0] + dozens * 10 + hundreds * 100;
		}
		return -1;
	}

	public int convertToFourDigits(int x) {
		if (x < 1000) {
		   arrayOfDigits=this.digits(x);
		   int thousand=arrayOfDigits[0]*1000;
		   return thousand+x;
	    }
		return -1;
	}

}

package com.epam.jwd.simple_tasks;
/*
 Напишите программу, которая для введенной последовательности целых ненулевых чисел
  (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:

является ли последовательность возрастающей;
есть ли в ней хотя бы одна пара одинаковых соседних чисел;
является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет);
 Для ввода значений с клавиатуры можно воспользваться классом Scanner.
*Примечание: массив или коллекцию для решения этой задачи использовать нельзя.
 */
import java.util.Scanner;

public class Task10 {

	private static boolean increasingSequence = false;
	private static boolean pairOfSameNumbers = false;
	private static boolean signChangeSequence = false;
	private static boolean alwaysChangeSign=true;

	public static void main(String[] args) {

		int oldNumber = 0;
		int newNumber = 0;
	    int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int number");
		while (sc.hasNextInt() == true) {
			
			newNumber = sc.nextInt();
			if (newNumber == 0) {
				if (count > 1) {
					System.out
							.println("Sequence increases: " + increasingSequence + "," + " has a pair of same numbers: "
									+ pairOfSameNumbers + "," + " every number change sign: " + signChangeSequence);
					sc.close();
					return;
				} else {
					System.out.println("You entered less then 2 numbers");
					System.out.println("Enter next number: ");
					if(sc.hasNextInt()==true) newNumber=sc.nextInt();
				}
			}
			if(++count>1) {
				increasingSequence=Task10.checkSequenceForIncreasing(oldNumber, newNumber);
				pairOfSameNumbers=Task10.checkSequenceForPairSameNumbers(oldNumber, newNumber);
				signChangeSequence=Task10.checkSequenceForChangeingSign(oldNumber, newNumber);
			};
			oldNumber = newNumber;

		}
		System.out.println("You entered an invalid value");
		sc.close();
	}
	
	private static boolean checkSequenceForIncreasing(int firstNumber, int secondNumber) {
		if(firstNumber<=secondNumber) return true;
		return false;
	}
	
	private static boolean checkSequenceForPairSameNumbers(int firstNumber, int secondNumber) {
		if(firstNumber==secondNumber) return true;
		
		if(pairOfSameNumbers==false) return false;
		return true;
	}
	
	private static boolean checkSequenceForChangeingSign(int firstNumber, int secondNumber) {
		if(alwaysChangeSign==true) {
			if((firstNumber<0&&secondNumber>0)||(firstNumber>0&&secondNumber<0)) return true;
		}
		alwaysChangeSign=false;
		return false;
	}

}

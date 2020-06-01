package com.epam.jwd.simple_tasks;

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
		boolean numberOfEnterMoreOne = false;
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

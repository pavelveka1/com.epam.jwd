package com.epam.jwd.simple_tasks;
/*
 ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������).
  �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
 */
public class Task7 {
	
	public static void main(String[] args) {
		System.out.println(Task7.swapIntegerAndFractional(234.687));
	}
	
	public static double swapIntegerAndFractional(double n) {
		
		int m=(int)n;
		n=n*1000;
		n=n%(m*1000);
		double k=(double)m/1000;
		return n+k;
	}
	
	

}

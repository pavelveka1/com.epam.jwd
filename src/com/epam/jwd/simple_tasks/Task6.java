package com.epam.jwd.simple_tasks;
/*
 ����� ������ n ������ �������������� ���������� ����������� �� �������
  Sn = ( a1 + an )* n / 2. ���� a1 � d (��� �������������� ����������). 
  ������� n, ��� ������� �������� Sn ������� �� �������� ����� int � long (����������������� �����).
 */
public class Task6 {
	
	int n=0;

	public static void main(String[] args) {

		int a1=10;
		int d=1;
		Task6 test=new Task6();
		System.out.println(test.calculateIterationOutOfRangeInteger(a1, d));
		System.out.println(test.calculateIterationOutOfRangeLong(a1, d));
	
	}
	
	public int calculateIterationOutOfRangeInteger(int a1, int step) {
		int s=0;
		int n=1;
		while((Integer.MAX_VALUE-s)>(a1+step*(n-1))) {
			s=(a1+a1+step*n)*(n/2);
			n++;
		}
		System.out.println(s);
		return ++n;
	}
	
	public long calculateIterationOutOfRangeLong(long a1, long step) {
		long s=0;
		long n=1;
		while((Long.MAX_VALUE-s)>(a1+step*(n-1))) {
			s=(a1+a1+step*n)*(n/2);
			n++;
		}
		System.out.println(s);
		return ++n;
	}
}

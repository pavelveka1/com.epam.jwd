package com.epam.jwd.simple_tasks;

//���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, 
//� �������� �� ����������� ����������, ���� ��� �� ���.
public class Task3 {
	public static void main(String[] args) {

		Task3.convertNumbers(10, -5, 4);
	}

	public static void convertNumbers(double a, double b, double c) {
		if(a>b && b>c) {
			a=a*2;
			b=b*2;
			c=c*2;
			
		}else {
			a=Math.abs(a);
			b=Math.abs(b);
			c=Math.abs(c);
		}
		System.out.println("a = "+a+", b = "+b+", c = "+c);
	}

}

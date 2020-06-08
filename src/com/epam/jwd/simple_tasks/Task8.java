package com.epam.jwd.simple_tasks;

public class Task8 {

	public static void calculateFunction(int start, int end, int step, int constant ) {
		int y=0;
		for(int x=start; x<=end; x=x+step) {
			if(x==15) {
				y=(x+constant)*2;
			}else {
				y=x-constant+6;
			}
			System.out.println("y = "+y);
		}
	}

}

package com.epam.jwd.simple_tasks;

/*
 Ñóììà ïåğâûõ n ÷ëåíîâ àğèôìåòè÷åñêîé ïğîãğåññèè âû÷èñëÿåòñÿ ïî ôîğìóëå
  Sn = ( a1 + an )* n / 2. Äàíû a1 è d (øàã àğèôìåòè÷åñêîé ïğîãğåññèè). 
  Íàéäèòå n, ïğè êîòîğîì çíà÷åíèå Sn âûõîäèò çà äèàïàçîí òèïîâ int è long (ıêñïåğèìåíòàëüíûì ïóòåì).
 */
public class Task6 {

	public static int calculateIterationOutOfRangeInteger(int a1, int step) {
		int sum = 0;
		int n = 1;
		while ((Integer.MAX_VALUE - sum) > (a1 + step * (n - 1))) {
			sum = (a1 + a1 + step * n) * (n / 2);
			n++;
		}
		return ++n;
	}

	public static long calculateIterationOutOfRangeLong(long a1, long step) {
		long sum = 0;
		long n = 1;
		while ((Long.MAX_VALUE - sum) > (a1 + step * (n - 1))) {
			sum = (a1 + a1 + step * n) * (n / 2);
			n++;
		}
		return ++n;
	}
}

package by.ad.les06;

/*
 * 4. Написать метод(методы) для нахождения наименьшего 
 * общего кратного трех натуральных чисел
 */
public class Task04 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		int nok;
		int m;

		a = 3;
		b = 15;
		c = 27;

		m = Task04.maximum(a, b, c);
		nok = Task04.nok(a, b, c, m);
		Task04.print(nok);

	}

	public static int maximum(int a, int b, int c) {

		int max;
		int m;
		m = 0;
		max = a;

		int[] arr1 = new int[] { a, b, c };
		for (int n = 0; n < arr1.length; n++) {
			if (arr1[n] > max) {
				max = arr1[n];
				m = n;

			}
		}
		return m;
	}

	public static int nok(int a, int b, int c, int m) {
		int i;
		int nok;
		int[] arr1 = new int[] { a, b, c };
		i = arr1[m];

		while (!(i % arr1[0] == 0 && i % arr1[1] == 0 && i % arr1[2] == 0)) {
			i++;
		}
		nok = i;
		return nok;
	}

	public static void print(int nok) {
		System.out.println("НОК " + nok);
	}

}

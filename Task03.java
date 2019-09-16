package by.ad.les06;

/*
 * Написать метод(методы) для нахождения 
 * наибольшего общего делителя четырех натуральных чисел. 
 */
public class Task03 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int nod;
		int m;

		a = 3;
		b = 9;
		c = 27;
		d = 30;
		
		m=Task03.minimum(a, b, c, d);
		nod=Task03.nod(a, b, c, d, m);
		Task03.print(nod);

	}	
		
	
		public static int minimum (int a, int b, int c, int d) {
		
		int min;
		int m;
		m = 0;
		min = a;

		int[] arr1 = new int[] { a, b, c, d };
		for (int n = 0; n < arr1.length; n++) {
			if (arr1[n] < min) {
				min = arr1[n];
				m = n;

			}
		}
		return m;
		}
		
		public static int nod (int a, int b, int c, int d, int m) {
		int i;
		int nod;
		int[] arr1 = new int[] { a, b, c, d };
		i = arr1[m];
		
		while (!(arr1[0] % i == 0 && arr1[1] % i == 0 && arr1[2] % i == 0 && arr1[3] % i == 0)) {
			i--;
		}
		nod = i;
		return nod;
		}	
		public static void print(int nod) {
		System.out.println("НОД " + nod);
		}
	
}
	


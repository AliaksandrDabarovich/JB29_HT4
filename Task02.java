package by.ad.les06;

/*
 * 2. Написать метод(методы) для нахождения 
 * наибольшего общего делителя и наименьшего 
 * общего кратного двух натуральных чисел: 
 */
public class Task02 {

	public static void main(String[] args) {
		int a;
		int b;
		int nod;
		int nok;
		
		a=15;
		b=25;
		nod = Task02.nod(a, b);

		nok = Task02.nok(a, b); 
		Task02.print(nod, nok);
	}

	public static int nod(int a, int b) {
		int nod;
		
		int i;
		if (a < b) {
			i = a;

			while (!(a % i == 0 && b % i == 0)) {
				i--;
			}
			nod = i;
		} else {
			i = b;

			while (!(a % i == 0 && b % i == 0)) {
				i--;
			}
			nod = i;
		}
		return nod;

	}

	
	  public static int nok(int a, int b) { 
		  int nok;
		  int j;
		  if (a < b) {
				j = b;

				while (!(j % a == 0 && j % b == 0)) {
					j++;
				}
				nok = j;
			} else {
				j = a;

				while (!(j % a == 0 && j % b == 0)) {
					j++;
				}
				nok = j;
			}
			return nok;
		  }
	 
	public static void print(int nod, int nok) {
		System.out.println("НОД "+nod+"\n"+"НОК "+nok);
	}
}

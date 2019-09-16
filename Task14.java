package by.ad.les06;

import java.util.ArrayList;
import java.util.Random;

/*
 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 
 */
public class Task14 {

	public static void main(String[] args) {
		int a;
		int b;

		int c;
		int d;
		int f;

		ArrayList arr = new ArrayList();
		ArrayList arr2 = new ArrayList();

		a = Task14.randomize();
		c = Task14.randomize();

		d = a;
		f = c;

		arr = calc(a);
		arr2 = calc(c);

		print(arr);
		print(arr2);

		Task14.compare(arr, arr2, d, f);

	}

	public static ArrayList calc(int a) {
		ArrayList arr = new ArrayList();

		int b;
		while (a > 0) {
			b = a % 10;
			arr.add(b);
			a /= 10;

		}
		return arr;
	}

	public static int randomize() {
		int a;
		Random rand = new Random();
		a = rand.nextInt(10000);
		System.out.println(a);
		return a;
	}

	public static void print(ArrayList arr) {

		for (int k = 0; k < arr.size(); k++) {
			System.out.println(arr.get(k));
		}
		System.out.println("------------------");
	}

	public static void compare(ArrayList arr, ArrayList arr2, int d, int f) {
		if (arr.size() > arr2.size()) {
			System.out.println("Количество цифр в числе " + d + " больше чем в числе " + f);
		} else if (arr.size() < arr2.size()) {
			System.out.println("Количество цифр в числе " + f + " больше чем в числе " + d);
		} else {System.out.println("Количество цифр одинаково");}
	}

}

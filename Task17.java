package by.ad.les06;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 17. Натуральное число, в записи которого n цифр, называется числом 
 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. 
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Task17 {

	public static void main(String[] args) {
		int k;
		int n;
		int a;
		int b;
		int sum;

		sum = 0;
		a=0;
		b=0;
		k = 14000;
		n = 4;

		calc(k, n, a, b, sum);

	}

	public static void calc(int k, int n, int a, int b,int sum) {
		for (int i = 1; i < k; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			b = i;
			while (b > 0) {
				a = b % 10;
				arr.add(a);
				b /= 10;

			}

			sum=pow(sum, arr,n);
			print (sum, i);
			sum = 0;

		}
	}
	
	public static int pow (int sum, ArrayList<Integer> arr, int n) {
		for (int j = 0; j < arr.size(); j++) {
			sum = sum + (int) Math.pow(arr.get(j), n);
		}
		return sum;
	}
	
	public static void print (int sum, int i) {
		if (sum == i) {
			System.out.println(i);
		}
	}

}

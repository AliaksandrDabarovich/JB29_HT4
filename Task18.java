package by.ad.les06;

import java.util.ArrayList;

/*
 * 18. Найти все натуральные n-значные числа, цифры в 
 * которых образуют строго возрастающую последовательность 
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */
public class Task18 {

	public static void main(String[] args) {
		int k;
		int n;
		int a;
		int b;
		int sum;
		
		boolean boo;
		boo=false;
		

		sum = 0;
		a=0;
		b=0;
		k = 100;
		

		calc(k,  a, b, sum, boo);

	}

	public static void calc(int k,  int a, int b,int sum, boolean boo) {
		for (int i = 1; i < k; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			b = i;
			while (b > 0) {
				a = b % 10;
				arr.add(a);
				b /= 10;

			}

			boo=more(arr, boo);
			
			print (boo, i);
			sum = 0;

		}
	}
	
	public static boolean more (ArrayList<Integer> arr, boolean boo) {
		for (int j = 1; j < arr.size(); j++) {
			if (arr.get(j)<arr.get(j-1)) {
				boo=true;
			} else {
				boo=false;
				break;
			}
		}
		return boo;
		
	}
	
	public static void print (boolean boo, int i) {
		if (boo == true) {
			System.out.println(i);
		}
	}

}

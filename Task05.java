package by.ad.les06;

import java.util.Random;
import java.util.Arrays;
/*
 * 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел. 
 */
public class Task05 {

	public static void main(String[] args) {
		
		
		
		
	int[] Arr=creArr();
	int sum=calc(Arr);
	print (Arr, sum);
		
		
		
		
		

	}
	public static void print (int [] mas, int sum) {
		System.out.println(Arrays.toString(mas));
		System.out.println(sum);
	}
	
	public static int[] creArr () {
		int [] Arr = new int[3];
	Random rand = new Random ();
	for (int i=0; i<Arr.length; i++ ) {
		Arr[i] = rand.nextInt(1000);
		
	}
	return Arr;
	}
	
	public static int calc (int [] mas) {
		int min;
		int max;
		int sum;
		max = mas[0];
		min = mas [0];
		
		for (int j=0; j<mas.length; j++) {
			if (mas[j]<min) {
				min=mas[j];
			}
			if (mas[j]>max) {
				max=mas[j];
			}
			
		}
		return sum=min+max;
	}

}

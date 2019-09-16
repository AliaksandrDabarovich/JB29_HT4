package by.ad.les06;

import java.util.Arrays;
import java.util.Random;

/*
 * 8. Составить программу, которая в массиве A[N] находит второе по величине число 
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов). 
 */
public class Task08 {

	public static void main(String[] args) {
		int [] A = new int [10];
		int max;
		int second;
		
		A = mass (A);
		max = A[0];
		second = A[0];
		
		int [] B = Task08.calc(A, max, second);
		max=B[0];
		second=B[1];
		Task08.print(max, second, A);
			
		
	}

	public static int [] mass (int [] A) {
			
		Random rand = new Random ();
		
		for (int i=0; i<A.length; i++) {
			A[i]=rand.nextInt(1000);
						
		}
		return A;
		
		}
	public static int [] calc (int [] A, int max, int second) {
		
		int [] B = new int [2];
		int m;
		m=0;
		for (int j=0; j<A.length; j++) {
			if (A[j]>max) {
				max=A[j];
				m=j;
			}
		}
		if (m==0) {
			second = B[1];
		}
		B[0]=max;
		
		
		for (int k=0; k<A.length; k++) {
			
			if (k == m) {continue;}
			else if (A[k]>second){
				second=A[k];
			}
			
		}
		B[1]=second;
		return B;
	}
	
	public static void print (int max, int second, int [] A) {
		System.out.println(max);
		System.out.println(second);
		
		System.out.println(Arrays.toString(A));
	}

}

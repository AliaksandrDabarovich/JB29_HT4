package by.ad.les06;
import java.util.Arrays;
import java.util.Random;
/*
 * 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления суммы трех последовательно 
 * расположенных элементов массива с номерами от k до m. 
 */
public class Task11 {

	public static void main(String[] args) {
		
		
		int [] Arr = new int [9];
		Arr = Task11.mass(Arr);
		
		Task11.calc (Arr);
		

		
		
		

	}
	
	public static int [] mass (int [] Arr) {
		Random rand = new Random ();
		for (int j=0; j<Arr.length; j++) {
			Arr[j]=rand.nextInt(100);
		}
		return Arr;
	}
	
	public static void calc (int [] Arr) {
		int k;
		int m;
		k=0;
		m=Arr.length-2;
		for (int i=k; i<m; i=i+2) {
			System.out.println(Arr[i]+"\t"+Arr[i+1]+"\t"+Arr[i+2]);
		}
	}

}

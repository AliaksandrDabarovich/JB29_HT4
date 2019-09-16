package by.ad.les06;
import java.util.ArrayList;
import java.util.Random;
/*
 * 13. Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N. 
 
 */
public class Task13 {

	public static void main(String[] args) {
		int a;
		int b;
		
		
		ArrayList arr = new ArrayList ();
		a=Task13.randomize();
		arr = calc(a);
		print(arr);
		
		
		

	}
	
	public static ArrayList calc (int a) {
		ArrayList arr = new ArrayList ();
		
		int b;
		while (a>0) {
			b=a%10;
			arr.add(b);
			a/=10;
			
		}
		return arr;
	}
	
	public static int randomize () {
		int a;
		Random rand = new Random ();
		a=rand.nextInt(10000);
		System.out.println(a);
		return a;
	}
	
	public static void print (ArrayList arr) {

		for (int k = 0; k < arr.size(); k++) {
			System.out.println(arr.get(k));
}
	}
	

	
}

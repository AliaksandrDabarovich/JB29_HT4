package by.ad.les06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {

		int x;
		int y;
		int z;
		boolean boo;
		
		x = 331;
		y = 463 ;
		z = 733;
		
		ArrayList first = Task09.arr(x);
		ArrayList second = Task09.arr(y);
		ArrayList third = Task09.arr(z);
		
		Task09.print(first);
		Task09.print(second);
		Task09.print(third);
		
		boo = Task09.compare (first, second, third);
		Task09.printRes(boo);
		

	}
	public static ArrayList arr (int a) {
		ArrayList <Integer> first = new ArrayList <Integer> ();

		int i;

		i = a - 1;
		while (i > 1) {
			if (a % i == 0) {
				first.add(i);
			}
			i--;

		}
		
		return first;
	}
	
	public static void print (ArrayList first) {
		for (int k = 0; k < first.size(); k++) {
			System.out.println(first.get(k));
		}
		System.out.println("----------------------");
	}
	
	public static boolean compare (ArrayList first, ArrayList second, ArrayList third) {
		boolean boo;
		boo=false;
		
		for (int i=0; i<first.size(); i++) {
			for (int j=0; j<second.size(); j++) {
				for (int k=0; k<third.size(); k++) {
					if (first.get(i) == second.get(j) && second.get(j)== third.get(k)) {
						boo = true;
					}
					
				}
				
			}
			
		}
		
		
		return boo;
	}
	
	public static void printRes (boolean boo) {
		if (boo == true) {
			System.out.println("Числа НЕ взаимно простые");
		} else {
			System.out.println("Числа взаимно простые");
		}
	}

}

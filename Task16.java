package by.ad.les06;
/*
 * 16. Два простых числа называются «близнецами», 
 * если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - 
 * заданное натуральное число больше 2. Для решения задачи использовать декомпозицию. 
 */
public class Task16 {

	public static void main(String[] args) {
		int n;
		n=20;
		calc(n);
		
		
		
		
	}
	
	public static void calc(int n) {
		for (int i=n; i<2*n-1; i++) {
			System.out.println(i+"\t"+(i+2));
			
		}
	}

}

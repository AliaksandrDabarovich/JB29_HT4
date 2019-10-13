package by.ad.les06;

/*
 * 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task20 {
 
	public static void main(String[] args) {
		int n;
		
		int schet;
		
		
		n=4118;
		col(n);
		

	}
	
	public static void col(int n) {
		int schet;
		int sum;
		schet=0;
		while (n>0) {
			sum=calc(n);
			n-=sum;
			schet++;
			System.out.println(n);
		}
		print (schet);
	} 
	public static void print (int schet) {
		System.out.println("Количество повторений: "+schet);
	}
	
	public static int calc(int n) {
		int a;
		int b;
		int sum;
		
		sum=0;
		
		b=n;
		while (b>0) {
			a=b%10;
			sum+=a;
			b/=10;
		}
		return sum;
		
	} 

}


package by.ad.les06;

/*
 * 19. Написать программу, определяющую сумму n - 
 * значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. 
Для решения задачи использовать
декомпозицию.
 */
public class Task19 {

	public static void main(String[] args) {
		int n;
		int a;
		int b;
		int sum;
		n = 3;

		a = calc(n);
		sum=schit(a, n);
		System.out.println(sum);
		chet(sum);

	}
	public static void chet(int sum) {
		int b;
		int c;
		int quan;
		
		quan=0;
		b=sum;
		while (b > 0) {

			c = b % 10;
			if (c % 2 == 0) {
				quan++;
			}
			b /= 10;	
			}
			System.out.println(quan);
		}
		
	
	public static int schit(int a, int n) {
		int b;
		int c;
		int sum;
		boolean boo;
		boo = false;
		sum=0;
		for (int i = a; i >= (int) (1 * Math.pow(10, n - 1)); i--) {
			b = i;
			while (b > 0) {

				c = b % 10;
				if (c % 2 != 0) {
					boo = true;
				} else {
					boo=false;
					break;
					
				}
				b /= 10;
			}
			if (boo == true) {
				sum+=i;
			}
			boo = false;

		}
		return sum;

	}

	public static int calc(int n) {
		int a;
		a = (int) (1 * Math.pow(10, n) - 1);
		return a;

	}

}

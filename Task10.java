package by.ad.les06;
import java.util.Arrays;
/*
 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
 */
public class Task10 {

	public static void main(String[] args) {
		int [] Arr = new int [5];
		Arr = Task10.mas(Arr);
		
		
		int res;
		res = Task10.calc(Arr);
		
		Task10.print(Arr, res);
		
		
		
	}
	
	public static int [] mas (int [] Arr) {
		int j;
		j=0;
		
		for (int i=0; i<10; i++) {
			
			if (i == 0) {continue;}
			if (i%2 != 0) {
				Arr[j] = i;
				j++;
			}
		}
		return Arr;
	}
	public static int calc (int [] Arr) {
		int sub;
		int sum;
		sum=0;
		sub=1;
		for (int i=0; i<Arr.length; i++) {
			for (int j=1; j<Arr[i]; j++) {
				sub*=j;
			}
			sum+=sub;
		}
		return sum;
	}
	public static void print(int [] Arr, int res) {
		System.out.println(Arrays.toString(Arr));
		
		
		System.out.println(res);
	}

}

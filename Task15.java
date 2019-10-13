package by.ad.les06;
import java.util.ArrayList;

/*
 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N. 
 */
public class Task15 {

	public static void main(String[] args) {
		int K;
		int N;
		
		
		
		
		

		K = 4;
		N = 115;
		ArrayList<Integer> mas=calc(K, N);
		print(mas);
		

	}
	
	
	public static ArrayList<Integer> calc (int K, int N){
		int sum;
		int a;
		int b;
		b=0;
		ArrayList<Integer> arr = new ArrayList();
		for (int i = N; i > 0; i--) {
			a = i;
			sum=0;
			
			while (a>0) {
				b=a%10;
				sum+=b;
				a/=10;
				
				
				
			}
			
			if (sum == K) {
				arr.add(i);
				
			} 
			
				
		}
		return arr;
	}
	
	public static void print (ArrayList<Integer> mas) {
		for (int k = 0; k < mas.size(); k++) {
			System.out.println(mas.get(k));
}
	}

}

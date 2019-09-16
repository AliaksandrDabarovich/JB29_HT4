package by.ad.les06;

/*
 * 6. Вычислить площадь правильного шестиугольника
 *  со стороной а, используя метод вычисления площади треугольника. 
 */
public class Task06 {

	public static void main(String[] args) {

		int a;
		double s;
		a = 3;
		s = calc(a);
		print(s);

	}

	public static double calc (int a) {
		double s;
		s=( 3 * Math.sqrt(3))/2*a*a;
		return s;
	}

	public static void print (double s) {
		System.out.println("Площадь шестиугольника равна: "+s);
	}
}

package by.ad.les06;
/*
 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой. 
 */
public class Task12 {

	public static void main(String[] args) {
		int X;
		int Y;
		int Z;
		int T;
		
		double square1;
		double square2;
		
		double pol;
		double N;
		
		
		
		X=5;
		Y=6;
		Z=8;
		T=4;
		
		
		double [] arr = new double [2];
		arr = Task12.calc(X, Y, Z, T);
		square1 = arr[0];
		square2 = arr[1];
		
		Task12.print(square1, square2);
		
		
		

	}
	public static double [] calc (int X, int Y, int Z, int T) {
		double square1;
		double square2;
		double pol;
		double N;
		
		square1=0.5*X*Y;
		N=Math.sqrt(X*X+Y*Y);
		pol=0.5*(Z+T+N);
		square2=Math.sqrt(pol*(pol-Z)*(pol-T)*(pol-N));
		
		double [] arr = new double [2];
		arr[0] = square1;
		arr [1] = square2;
		return arr;
		
	}
	
	public static void print (double square1, double square2) {
		double square;
		System.out.println(square=square1+square2);
	}

}

package by.ad.les06;
/*
 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. 
 */


public class Task01 {

	public static void main (String [] Args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double square;
		
		x1=1;
		y1=2;
		x2=-2;
		y2=1;
		x3=0;
		y3=-3;
		
		square=Task01.square(x1,y1,x2,y2,x3,y3);
		
		Task01.print(square);
	}
	
	public static double square(double m1, double n1,double m2, double n2,double m3, double n3) {
		
	
		double square;
				
		square=0.5*Math.abs((m2-m1)*(n3-n1)-(m3-m1)*(n2-n1));
		
		return square;
		
	}
	public static void print (double square) {
		System.out.println(square);
	}
}

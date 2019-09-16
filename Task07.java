package by.ad.les06;
import java.util.Arrays;
import java.util.Random;
/*
 * 7. На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив. 
 */
public class Task07 {

	public static void main (String [] args) {
		double max = 0;
		double x1=0;
		double x2=0;
		double y1=0;
		double y2=0;
		double [] coord;
		
		coord= createMas ();
		double mass []=calc(coord,x1, x2, y1, y2);		
		max=mass [0];
		x1=mass [1];
		x2=mass [2];
		y1=mass [3];
		y2=mass [4];
		
		print (coord, max, x1, y1, x2, y2);
		
		
				
		
	}
	
	public static double [] calc ( double [] coord, double x1,	double x2,	double y1,
			double y2) {
		double max= 0;
		
		for (int i = 0; i < coord.length-1; i=i+2) {
			for (int j = 2; j < coord.length-1; j=j+2) {
				double currentDis;
				currentDis = dis (coord[i], coord[i+1], coord[j], coord[j+1]);
				
				if (max < currentDis) {
					max = currentDis;
					x1 = coord[i];
					x2 = coord[j];
					y1=coord[i+1];
					y2 = coord[j+1];
				}
			}
		}
		
		double [] mass = new double [5];
		mass [0]=max;
		mass [1]=x1;
		mass [2]=x2;
		mass [3]=y1;
		mass [4]=y2;
		
		return mass;
	}
	
	public static double [] createMas () {
		int vol=12;
		double [] coord = new double [vol];
		Random rand = new Random();
		
		for (int i=0; i<coord.length; i++) {
			coord[i] = rand.nextInt(3000);
						
		}
		return coord;
	}
	
	public static double dis (double x1, double y1, double x2, double y2) {
		double r1 = x2 - x1;
		double r2 = y2 - y1;
		double c = Math.sqrt (r1*r1 + r2*r2);
		return c;
	}
	public static void print (double [] coord, double max, double x1, double y1, double x2, double y2) {
		System.out.println(Arrays.toString(coord));
		System.out.println("Расстояние: "+max +"\n" +"x1: "+x1+"\n"+"x2: "+x2+"\n" +"y1: "+y1+"\n"+"y2: "+y2);
	}
	
	
}

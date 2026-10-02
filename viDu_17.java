package java_17;

import java.util.Scanner;

public class viDu_17 {
	public static void main(String[] args) {
		
		// giải phương trình bậc 2 : ax^2 + bx =c 
		double a , b , c , x;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số a :");
		a = sc.nextInt();
		System.out.println("nhập số b :");
		b = sc.nextInt();
		System.out.println("nhập số c :");
		c = sc.nextInt();
		
		if (a==0) {
			if (b==0) {
				if(c==0) {
					System.out.println("vô số nghiệm ");
				}
				else {
					System.out.println("vô nghiệm ");
				}
			}
			else {
				x = -c/b;
				System.out.println("phương trình có nghiệm là x= "+ x );
			}
		}
		else {
			double delta = Math.pow(b, 2) - 4*a*c ;
			if (delta < 0) {
				System.out.println("vô nghiệm ");
			}
			else {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("có nghiệm x1 = " + x1 + " và x2 = "+ x2 );
			}
		}
	}
}

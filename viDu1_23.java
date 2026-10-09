import java.util.Iterator;
import java.util.Scanner;

public class viDu1_23 {
	public static void main(String[] args) {
		double mang1[];
		double[] mang2;
		
		mang1 = new double[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < mang1.length; i++) {
		System.out.println("nhập phần tư thứ "+ (i+1) + " : ");
		mang1[i] = sc.nextDouble();
		
		}
		double tong = 0 ;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
			
		}
		System.out.println("tổng = " + tong );
		System.out.println("----------------");
		mang2 = new double[]{1,2,3,4,5,6};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println("phần tử số "+ i +": "+mang2[i]);
		}
	}
}

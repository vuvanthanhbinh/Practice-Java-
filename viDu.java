import java.util.Scanner;

public class viDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b; 
		System.out.println("nhập số a : ");
		a= sc.nextInt();
		System.out.println("nhập số b : ");
		b = sc.nextInt();
		int tong = a + b;
		System.out.println(" tổng của a + b là : " + tong );
	}
}

import java.util.Scanner;

public class viDu1_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("nhap so nguyen n : ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("nhập dữ liệu không đúng ");
		}
		
		System.out.println("gía trị nhập là : " + n);
		System.out.println("------------");
		System.out.println("ket thuc chuong trinh ");
		
	}
}

import java.util.Scanner;

public class viDu2_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a , b , x ;
		System.out.println("nhập số a :");
		a= sc.nextDouble();
		System.out.println("nhập số b :");
		b=sc.nextDouble();
		
		if (a==0) {
			if (b==0) {
				System.out.println("vô số nghiệm");
			}else {
				System.out.println("vô nghiệm");
			}
		}else {
			x = -b/a;
			System.out.println("có nghiệm x =" + x );
		}
	}
}

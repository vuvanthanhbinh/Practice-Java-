package java_15;

import java.util.Scanner;

public class vuDu_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a , b ;
		System.out.println("nhập số a : ");
		a = sc.nextDouble();
		System.out.println("nhập số b : ");
		b = sc.nextDouble();
		// hàm tuyệt đối 
		System.out.println("|a| = " + Math.abs(a));
		
		// hàm tìm min 
		System.out.println("min(a , b)" + Math.min(a, b));
		
		// hàm tìm max
		System.out.println("max(a, b)" + Math.max(a, b));
		
		//hàm ceil : làm tròn lên 
		System.out.println("làm tròn a =" + Math.ceil(a));
		
		//hàm floor : làm tròn xuống 
		System.out.println("làm tròn b =" + Math.floor(b));
		
		// hàm căn bậc 2 
		System.out.println("a căn 2 là : " + Math.sqrt(a));
		
		// hàm mũ a^b 
		System.out.println("a mũ b là :" + Math.pow(a, b));
		
	}
}

import java.util.Scanner;

public class viDu2_15 {
	public static void main(String[] args) {
		double r , dienTich , chuVi ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập bán kính r :");
		r = sc.nextDouble();
		
		// tính chu vi 
		chuVi = 2*Math.PI*r;
		System.out.println("chu vi = " + chuVi );
		System.out.println("chu vi làm tròn là :" + Math.ceil(chuVi));
		
		// tính diện tích 
		dienTich = Math.PI*Math.pow(r, 2);
		System.out.println("diện tichs hình chữ nhật là :" + dienTich);
		System.out.println("diện tích làm tròn là :" + Math.floor(dienTich));
	}
}

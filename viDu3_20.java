import java.util.Scanner;

public class viDu3_20 {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số nguyên n >0 :");
		n = sc.nextInt();
		
		String nhiPhan="";
// tính nhị phân chia liên tục cho 2 và lấy dư đảo ngược lại => kết quả 
		while ((n>0)) {
			nhiPhan = (n%2) + nhiPhan;
			n=n/2;
			
		}
		System.out.println(" chuỗi nhị phân là : ");
	}
}


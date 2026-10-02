import java.util.Scanner;

public class viDu_16 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.println("nhập số tự nhiên a :");
		a = sc.nextInt();
		
		if (a%2==0) {
			System.out.println("a là số chẵn ");
		}
		else {
			System.out.println("a là số lẻ ");
		}
	}
}

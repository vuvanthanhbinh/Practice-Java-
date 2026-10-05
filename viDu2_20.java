import java.util.Scanner;

public class viDu2_20 {
	public static void main(String[] args) {
		int x =1;
		Scanner sc = new Scanner(System.in);
		while (x!=0) {
			System.out.println("nhập x = 0 để thoát ");
			System.out.println("nhập x :");
			x = sc.nextInt();
		}
		int i =0;
		while (true) {
			i++;
			System.out.println(i);
			if (i == 10) {
				break;
			}
		}
	}
}

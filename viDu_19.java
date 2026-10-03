import java.util.Scanner;

public class viDu_19 {
	public static void main(String[] args) {
		System.out.println(" bài tập tìm số ngày của tháng");
		int thang ,nam ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhập vào tháng :");
		thang = sc.nextInt();
		System.out.println("nhập vào năm :");
		nam = sc.nextInt();
		
		
		switch (thang) {
		case 1:
			System.out.println("tháng có 31 ngày ");
			break;
		case 3:
			System.out.println("tháng có 31 ngày ");
			break;
		case 4:
			System.out.println("tháng có 30 ngày ");
			break;
		case 5:
			System.out.println("tháng có 31 ngày ");
			break;
		case 6:
			System.out.println("tháng có 30 ngày ");
			break;
		case 7:
			System.out.println("tháng có 31 ngày ");
			break;
		case 8:
			System.out.println("tháng có 31 ngày ");
			break;
		case 9:
			System.out.println("tháng có 30 ngày ");
			break;
		case 10:
			System.out.println("tháng có 31 ngày ");
			break;
		case 11:
			System.out.println("tháng có 30 ngày ");
			break;
		case 12:
			System.out.println("tháng có 31 ngày ");
			break;
		case 2:
			if ((nam%4==0 && nam%100!=0) || (nam%400==0)) {
				System.out.println("tháng có 29 ngày ");
			}
			else {
				System.out.println("tháng có 28 ngày ");
			}
			break;
		default:
			System.out.println("nhập sai dữ liệu ");
			break;
		}
	}
}


public class java2_21 {
	public static void main(String[] args) {
		int out , in = 0;
		for (out = 0; out < 10; out++) {
			for ( in = 0; in < 20 ; in++) {
				if (in>10) {
					break;
				}
			}
			System.out.println("bên trong vòng lặp out = " + out + ", in " + in);
		}
		System.out.println("bên ngoài vòng lặp out : " + out + ", in "+ in);
	}
}

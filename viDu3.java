class MyDate{
	private int day , month , year ;

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override 
	public String toString() {
		return this.day + " | " + this.month + " | " + this.year;
	}
	
}
public class viDu3 {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(25,2,2007);
		MyDate md2 = new MyDate(28,3,2007);
		MyDate md3 = new MyDate(24,8,2007);
		System.out.println("md1 : " + md1);
		System.out.println("md1 : " + md1.toString());
		System.out.println(md2);
	}
}

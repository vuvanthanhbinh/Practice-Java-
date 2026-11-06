import java.util.Objects;

class MyDate{
	private int day , month , year ;

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(day), Integer.valueOf(month), Integer.valueOf(year));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

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
public class viDu1 {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(25,2,2007);
		MyDate md2 = new MyDate(28,3,2007);
		MyDate md3 = new MyDate(24,8,2007);
		System.out.println("md1 : " + md1);
		System.out.println("md1 : " + md1.toString());
		System.out.println(md2);
		
		System.out.println("md1 so sánh md3 : " + md1.equals(md3));
	}
}


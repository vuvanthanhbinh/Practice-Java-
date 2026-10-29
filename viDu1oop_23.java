

class myDate {
	private int day , month, year;
	
	public myDate( int day , int month , int year ) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void printDay() {
		System.out.println("day : " + day);
	}
	public void printMonth() {
		System.out.println("month : " + month);
	}
	public void printYear() {
		System.out.println("year : " + year);
	}
}

public class viDu1oop_23 {
	public static void main(String[] args) {
		myDate kk = new myDate(25,02,2007);
		
		kk.printDay();
		kk.printMonth();
		kk.printYear();
	}
}



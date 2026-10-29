class banCaPhe {
	private String tenLoai;
	private Double giaTien;
	private Double khoiLuong;
	
	public banCaPhe(String tenLoai,Double giaTien,Double khoiLuong){
		this.giaTien = giaTien;
		this.khoiLuong=khoiLuong;
		this.tenLoai=tenLoai;
	}
	
	public double tinhTien() {
		return this.giaTien*this.khoiLuong;
	}
	
	public boolean kiemTra(double khoiLuong ) {
		return this.khoiLuong > khoiLuong;
	}
	
	public boolean kiemTraHoaDon() {
		return this.tinhTien() > 500000;
	}
}


public class viDu2 {
	public static void main(String[] args) {
		banCaPhe hd = new banCaPhe("cà phê Laura", 100000.0, 1.5);
		System.out.println("tổng tiền " + hd.tinhTien());
		System.out.println("kiểm tra khối lượng " + hd.kiemTra(2));
		System.out.println("kiểm tra hóa đơn "+ hd.kiemTraHoaDon());
	}
}

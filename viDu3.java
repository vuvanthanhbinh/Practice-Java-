class ngayChieu {
	private int ngay ;
	private int thang ;
	private int nam ;
	
	public ngayChieu(int ngay , int thang , int nam) {
		this.ngay = ngay;
		this.thang =  thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
}

class hang {
	private String tenHangSX;
	private String quocGia;
	
	public hang(String tenHangSX , String quocGia ) {
		this.tenHangSX = tenHangSX;
		this.quocGia = quocGia;
	}

	public String getTenHangSX() {
		return tenHangSX;
	}

	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}	
}

class phim {
	private String tenPhim;
	private int namSX;
	private hang hangSX;
	private double giaVe;
	private ngayChieu ngayChieu;
	
	public phim(String tenPhim,int namSX,hang hangSX,double giaVe,ngayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSX = namSX;
		this.hangSX = hangSX;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public hang getHangSX() {
		return hangSX;
	}

	public void setHangSX(hang hangSX) {
		this.hangSX = hangSX;
	}
	
	public boolean kiemTraGiaVe(phim phimkhac) { 
		if (this.giaVe < phimkhac.giaVe) {
			return true;
		}else {
			return false;
		}
	}
	
	public double giaSauGiam( int x ) {
		return this.giaVe*(1-x/100);
	}
	
	public String layTenHangSX() {
		return this.hangSX.getTenHangSX();
	}
}

public class viDu3 {
	public static void main(String[] args) {
		ngayChieu ngay1 = new ngayChieu(25,2,2007);
		ngayChieu ngay2 = new ngayChieu(25,2,2006);
		ngayChieu ngay3 = new ngayChieu(25,2,2005);
		
		hang hang1 = new  hang("Hãng A","Việt Nam ");
		hang hang2 = new  hang("Hãng B","Thái Lan ");
		hang hang3 = new  hang("Hãng C","Nga ");
		
		phim phim1 = new phim("Bố Già ", 2020, hang1, 500000, ngay1);
		phim phim2 = new phim("The Walking Dead ", 2021, hang2, 600000, ngay2);
		phim phim3 = new phim("Toy Story  ", 2019, hang3, 400000, ngay3);
		
		System.out.println("so sánh bộ phim 1 rẻ hơn phim 2 : " + phim1.kiemTraGiaVe(phim2));
		System.out.println("so sánh phim 2 rẻ hơn phim 3 : " + phim2.kiemTraGiaVe(phim3));
		
		System.out.println("tên hãng sản xuất bộ phim 3 : " + phim3.layTenHangSX());
		
		System.out.println("giá phim 1 sau khi giảm 50% là : " + phim1.giaSauGiam(50));
	}
}

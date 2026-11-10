class QuocGia {
	private String maQG;
	private String tenQG;
	
	public QuocGia(String maQG , String tenQG) {
		this.maQG= maQG;
		this.tenQG=tenQG;
	}
	
	public String getMaQG() {
		return maQG;
	}
	public void setMaQG(String MaQG) {
		this.maQG = MaQG;
	}
	
	public String getTenQG() {
		return tenQG;
	}
	public void setTenQG(String tenQG) {
		this.tenQG = tenQG;
	}
}

class HangSX {
	private String tenHang;
	private QuocGia quocGia;
	
	public HangSX(String tenHang, QuocGia quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
}

class NgaySX {
	private int ngay , thang , nam;

	public NgaySX(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
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

class MayTinh {
	private HangSX hangSX;
	private NgaySX ngaySX;
	private double giaBan;
	private int thangBaoHanh;
	
	public MayTinh(HangSX hangSX, NgaySX ngaySX, double giaBan, int thangBaoHanh) {
		this.hangSX = hangSX;
		this.ngaySX = ngaySX;
		this.giaBan = giaBan;
		this.thangBaoHanh = thangBaoHanh;
	}

	public HangSX getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}

	public NgaySX getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(NgaySX ngaySX) {
		this.ngaySX = ngaySX;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getThangBaoHanh() {
		return thangBaoHanh;
	}

	public void setThangBaoHanh(int thangBaoHanh) {
		this.thangBaoHanh = thangBaoHanh;
	}
	
	public boolean checkGia(MayTinh mayTinhKhac) {
		if (this.giaBan < mayTinhKhac.giaBan) {
			return true;
		}else return false;
	}
	
	public String layTenQGSX() {
		return this.hangSX.getQuocGia().getTenQG();
	}
	
}

public class viDu2_25 {
	public static void main(String[] args) {
		NgaySX ngay1 = new NgaySX(15,8,2023); 
		NgaySX ngay2 = new NgaySX(14,9,2022);
		NgaySX ngay3 = new NgaySX(13,10,2021);
		
		QuocGia quocgia1 = new QuocGia("VN", "việt nam");
		QuocGia quocgia2 = new QuocGia("USA", "hoa kì");
		QuocGia quocgia3 = new QuocGia("UK", "vương quốc anh");
		
		HangSX hang1 = new HangSX ("macbook ", quocgia1);
		HangSX hang2 = new HangSX ("asus ", quocgia2);
		HangSX hang3 = new HangSX ("lenovo ", quocgia3);
		
		MayTinh maytinh1 = new MayTinh(hang1, ngay1, 30000000, 12);
		MayTinh maytinh2 = new MayTinh(hang2, ngay2, 24000000, 24);
		MayTinh maytinh3 = new MayTinh(hang3, ngay3, 17000000, 6);
		
		System.out.println("------ so sánh giá máy : ");
		System.out.println("máy 1 nhỏ hơn máy 2 : " + maytinh1.checkGia(maytinh2));
		System.out.println("máy 1 nhỏ hơn máy 3 : " + maytinh1.checkGia(maytinh3));
		System.out.println("máy 2 nhỏ hơn máy 3 : " + maytinh2.checkGia(maytinh3));
		
		System.out.println("------ tên quốc gia sản xuất máy tính : ");
		System.out.println("máy 1 : " + maytinh1.layTenQGSX());
		System.out.println("máy 2 : " + maytinh2.layTenQGSX());
		System.out.println("máy 3 : " + maytinh3.layTenQGSX());
	}
}

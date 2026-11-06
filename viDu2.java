class quyenSach {
    private String tenSach;
    private inforTacGia tacGia; 
    private double giaBan;
    private int namXuatBan;

    public quyenSach(String tenSach, inforTacGia tacGia, double giaBan, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public inforTacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(inforTacGia tacGia) {
		this.tacGia = tacGia;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public void inTenSach() {
		System.out.println(" ten sach la : " + this.tenSach);
	}
	public boolean kiemTraSach(quyenSach obj) {
		if (this.namXuatBan == obj.namXuatBan) {
			return true;
		}else {
			return false;
		}
	}
	public double giaSauKhiGiam( double x ) {
		return this.giaBan*(1-x/100);
	}
}

class inforTacGia {
	private String ten;
	private inforNgay ngaySinh;
	public inforTacGia(String ten, inforNgay ngaySinh) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public inforNgay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(inforNgay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}

class inforNgay {
	private int ngay , thang , nam ;
	public inforNgay (int ngay , int thang , int nam) {
		this.nam = nam;
		this.ngay = ngay;
		this.thang = thang;
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

public class viDu2 {
	public static void main(String[] args) {
		inforNgay ngay1 = new inforNgay(25,2,2007);
		inforNgay ngay2 = new inforNgay(25,2,2006);
		inforNgay ngay3 = new inforNgay(25,2,2005);
		
		inforTacGia tacgia1 = new inforTacGia("binh", ngay1);
		inforTacGia tacgia2 = new inforTacGia("sang", ngay2);
		inforTacGia tacgia3 = new inforTacGia("duyet", ngay3);
		
		quyenSach sach1 =  new quyenSach("de men phieu luu ky", tacgia1, 90000, 2023);
		quyenSach sach2 =  new quyenSach("nha gia kim", tacgia2, 40000, 2022);
		quyenSach sach3 =  new quyenSach("dac nhan tam", tacgia3, 70000, 2021);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println(" so sanh NXB sach1 va sach3 " + sach1.kiemTraSach(sach3) );
		
		System.out.println(" gia sach 1 sau giam 10% la : " + sach1.giaSauKhiGiam(10));
		System.out.println(" gia sach 2 sau giam 20% la : " + sach2.giaSauKhiGiam(20));
		System.out.println(" gia sach 3 sau giam 30% la : " + sach3.giaSauKhiGiam(30));
	}
}

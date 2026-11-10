import java.util.Objects;

class NgaySinh {
	private int ngay , thang , nam;

	public NgaySinh(int ngay, int thang, int nam) {
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

class Lop {
	private String tenLop;
	private String tenKhoa;
	
	public Lop(String tenLop, String tenKhoa) {
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenKhoa() {
		return tenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}
}

class SinhVien {
	private String maSV;
	private String hoTen;
	private NgaySinh ngaySinh;
	private double diemTB;
	private Lop lopHoc;

	public SinhVien(String maSV, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lopHoc) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lopHoc = lopHoc;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(Lop lopHoc) {
		this.lopHoc = lopHoc;
	}
	
	public String kiemTra() {
	    if (this.diemTB >= 5.0) {
	        return "Đạt";
	    } else {
	        return "trượt";
	    }
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(ngaySinh, other.ngaySinh);
	}

	public String layTenKhoa() {
		return this.lopHoc.getTenKhoa();
	}
}

public class viDu1_25 {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(25,2,2007);
		NgaySinh ngay2 = new NgaySinh(25,2,2006);
		NgaySinh ngay3 = new NgaySinh(25,2,2005);
		
		Lop lop1 = new Lop("DH01", "CNTT1");
		Lop lop2 = new Lop("DH02", "CNTT2");
		Lop lop3 = new Lop("DH03", "CNTT3");
		
		SinhVien sinhvien1 = new SinhVien("001", "binh", ngay1, 4.0, lop1);
		SinhVien sinhvien2 = new SinhVien("002", "sang", ngay2, 5.0, lop2);
		SinhVien sinhvien3 = new SinhVien("003", "manh", ngay3, 6.0, lop3);
		
		System.out.println("ten khoa : ");
		System.out.println("sv1 : " + sinhvien1.layTenKhoa());
		System.out.println("sv2 : " + sinhvien2.layTenKhoa());
		System.out.println("sv3 : " + sinhvien3.layTenKhoa());
		System.out.println("kiem tra thi dat : ");
		System.out.println("sv1 : " + sinhvien1.kiemTra());
		System.out.println("sv2 : " + sinhvien2.kiemTra());
		System.out.println("sv3 : " + sinhvien3.kiemTra());
		System.out.println("kiem tra cung ngay sinh : ");
		System.out.println(" sv1 va sv2 : "+ sinhvien1.equals(sinhvien2));
		System.out.println(" sv1 va sv3 : "+ sinhvien1.equals(sinhvien3));
		System.out.println(" sv3 va sv2 : "+ sinhvien3.equals(sinhvien2));
	}
}

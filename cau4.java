import java.util.*; 

class KhachHang {
    static int dem = 0 ;
    String ma , ten , gioiTinh , ngaySinh , diaChi ; 
    KhachHang (String ten , String gt, String ns , String dc) {
        this.ma = String.format("KH%03d", ++dem);
        this.ten = ten;
        this.gioiTinh = gt;
        this.ngaySinh = ns;
        this.diaChi = dc;
    }
}

class MatHang {
    static int dem = 0 ;
    String ma , ten , donVi ; 
    long giaMua , giaBan ; 
    MatHang (String ten , String dv, long gm , long gb) {
        this.ma = String.format("MH%03d", ++dem);
        this.ten = ten;
        this.donVi = dv;
        this.giaMua = gm;
        this.giaBan = gb;
    }
}

class HoaDon {
    static int dem = 0 ;
    String ma ;
    KhachHang kh ;
    MatHang mh ;
    long soLuong ; 
    HoaDon (KhachHang kh, MatHang mh, long sl) {
        this.ma = String.format("HD%03d", ++dem);
        this.kh = kh;
        this.mh = mh;
        this.soLuong = sl;
    }
    long thanhTien() {
        return mh.giaBan * soLuong;
    }
    @Override 
    public String toString() {
        return ma + " " + kh.ten + " " + kh.diaChi + " " + mh.ten + " " + mh.donVi + " " + mh.giaMua + " " + mh.giaBan + " " + soLuong + " " + thanhTien();

    }
}

public class cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, KhachHang> dsKH = new HashMap<>();
        for(int i=0; i<n; i++){
            KhachHang k = new KhachHang(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());

            dsKH.put(k.ma, k);
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String, MatHang> dsMH = new HashMap<>();
        for(int i=0; i<m; i++){
            String ten = sc.nextLine().trim();
            String dv = sc.nextLine().trim();
            long gm = Long.parseLong(sc.nextLine().trim());
            long gb = Long.parseLong(sc.nextLine().trim());
            MatHang mh = new MatHang(ten, dv, gm, gb);
            dsMH.put(mh.ma, mh);
        }

        int k = Integer.parseInt(sc.nextLine().trim());
        for(int i=0; i<k; i++){
            String[] p = sc.nextLine().trim().split("\\s+");
            HoaDon hd = new HoaDon(dsKH.get(p[0]), dsMH.get(p[1]), Long.parseLong(p[2]));
            System.out.println(hd);
        }
    }
}



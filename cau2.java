import java.util.*;

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, String> ten = new HashMap<>();
        Map<String, Long[]> gia = new HashMap<>();

        for(int i=0; i<n; i++){
            String ma = sc.nextLine().trim();
            String tenSP = sc.nextLine().trim();
            long g1 = Long.parseLong(sc.nextLine().trim());
            long g2 = Long.parseLong(sc.nextLine().trim());
            ten.put(ma, tenSP);
            gia.put(ma, new Long[]{g1, g2});
        }
        int k = Integer.parseInt(sc.nextLine().trim());
        for(int i=1; i<=k; i++){
            String[] p = sc.nextLine().trim().split("\\s+");
            String maHD = p[0];
            long sl = Long.parseLong(p[1]);

            String loai = maHD.substring(0, 2);
            int kieu = maHD.charAt(2) - '0';
            long donGia = gia.get(loai)[kieu - 1];
            long thanhTien = donGia * sl;
            
            int pt = sl >= 150 ? 50 : (sl>=100 ? 30 : sl>=50 ? 15 : 0 );
            long giam = thanhTien * pt / 100;
            long phaiTra = thanhTien - giam;

            System.out.printf("%s-%03d %s %d %d%n ", maHD , i , ten.get(loai), giam, phaiTra);
        }
    }
}

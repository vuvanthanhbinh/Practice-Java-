import java.util.*;

public class cau1 {
    static long phuCap(String cv){
        switch (cv) {
            case "GD": return 500;
            case "PGD": return 400;
            case "TP": return 300;
            case "KT": return 250;
            default: return 100;
        }
    }
    
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String [] ten = new String[n], cv = new String[n];
        long luong [] = new long[n];

        for(int i=0; i<n; i++){
            ten[i] = sc.nextLine().trim();
            cv[i] = sc.nextLine().trim();
            long cb = Long.parseLong(sc.nextLine().trim());
            long ngay = Long.parseLong(sc.nextLine().trim());
            luong[i] = cb * ngay;
        }
        String key = sc.nextLine().trim();
        for(int i=0; i<n; i++){
            if (!cv[i].equals(key)) continue;
            long pc = phuCap(cv[i]);
            double t = (pc + luong[i]) * 2.0/3;
            long tamUng = (t< 25000) ? Math.round(t/1000)*1000 : 25000;
            long conLai = pc + luong[i] - tamUng;
            System.out.printf("NV%02d %s %d %d %d %d%n", i+1, ten[i],pc, luong[i], tamUng, conLai);
        }
    }
}

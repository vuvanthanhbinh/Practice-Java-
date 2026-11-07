import java.util.*;
public class bai3 {
    static String fmt(int t){
        return t%10 ==0 ? String.valueOf(t/10) : (t/10 ) + "." + (t%10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String ma = sc.nextLine().trim();
        String ten = sc.nextLine().trim();
        double toan = Double.parseDouble(sc.nextLine().trim());
        double ly = Double.parseDouble(sc.nextLine().trim());
        double hoa = Double.parseDouble(sc.nextLine().trim());
        int uuTien = 0;
        String kv = ma.substring(0, 3);
        if (kv.equals("KV1")) uuTien = 5;
        else if (kv.equals("KV2")) uuTien = 10;
        else if (kv.equals("KV3")) uuTien = 25;
        int tong = (int)Math.round((2*toan + ly + hoa) * 10);
        String tt = (tong + uuTien) >= 240 ? "TRUNG TUYEN" : "TRUOT";
        System.out.println(ma + " " + ten + " " + fmt(uuTien) + " " + fmt(tong) + " " + tt);
    }
}

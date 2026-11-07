import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class bai4 {
    static class KH {
        String ma, ten, phong;
        long ngay, tien;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] gia = {0, 25, 34, 50, 80};
        List<KH> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            KH k = new KH();
            k.ma = String.format("KH%02d", i);
            k.ten = sc.nextLine().trim();
            k.phong = sc.nextLine().trim();
            LocalDate a = LocalDate.parse(sc.nextLine().trim(), f);
            LocalDate b = LocalDate.parse(sc.nextLine().trim(), f);
            long dv = Long.parseLong(sc.nextLine().trim());
            k.ngay = ChronoUnit.DAYS.between(a, b) + 1;
            int tang = k.phong.charAt(0) - '0';
            k.tien = k.ngay * gia[tang] + dv;
            ds.add(k);
        }
        ds.sort((x, y) -> Long.compare(y.tien, x.tien));
        for (KH k : ds)
            System.out.println(k.ma + " " + k.ten + " " + k.phong + " " + k.ngay + " " + k.tien);
    }
}
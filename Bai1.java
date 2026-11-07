import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, String> mon = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
            int p = s.indexOf(' ');
            mon.put(s.substring(0, p), s.substring(p + 1).trim());
        }
        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String, String> gv = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine().trim();
            int p = s.indexOf(' ');
            gv.put(s.substring(0, p), s.substring(p + 1).trim());
        }
        int k = Integer.parseInt(sc.nextLine().trim());
        String[][] lop = new String[k][3];
        for (int i = 0; i < k; i++) lop[i] = sc.nextLine().trim().split("\\s+");
        String ma = sc.nextLine().trim();
        System.out.println("Giang vien: " + gv.get(ma));
        double tong = 0;
        for (String[] l : lop) {
            if (l[0].equals(ma)) {
                System.out.println(mon.get(l[1]) + " " + l[2]);
                tong += Double.parseDouble(l[2]);
            }
        }
        System.out.println("Tong: " + String.format(Locale.US, "%.2f", tong));
    }
}
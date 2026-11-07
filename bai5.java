import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, String> pb = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
            int p = s.indexOf(' ');
            pb.put(s.substring(0, p), s.substring(p + 1).trim());
        }
        int[][] hs = {
            {10, 12, 14, 20}, 
            {10, 11, 13, 16}, 
            {9, 10, 12, 14},  
            {8, 9, 11, 13}    
        };
        int m = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < m; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            long luong = Long.parseLong(sc.nextLine().trim());
            long ngay = Long.parseLong(sc.nextLine().trim());
            int loai = ma.charAt(0) - 'A';
            int nam = Integer.parseInt(ma.substring(1, 3));
            int c = nam <= 3 ? 0 : nam <= 8 ? 1 : nam <= 15 ? 2 : 3;
            long tien = luong * ngay * hs[loai][c] * 1000;
            System.out.println(ma + " " + ten + " " + pb.get(ma.substring(3)) + " " + tien);
        }
    }
}
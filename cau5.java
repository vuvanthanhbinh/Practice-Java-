import java.util.*;

public class cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] first = sc.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);

        String[] ma = new String[n] , ten =  new String[n] , sdt = new String[n];
        int[] nhom = new int[n];
        for (int i=0 ; i<n ; i++){
            ma[i] = sc.nextLine().trim();
            ten[i] = sc.nextLine().trim();
            sdt[i] = sc.nextLine().trim();
            nhom[i] = Integer.parseInt(sc.nextLine().trim());
        }

        String[] baiTap = new String[m + 1];
        for (int i =1 ; i<=m ; i++) baiTap[i] = sc.nextLine().trim();

        int q = Integer.parseInt(sc.nextLine(). trim());
        while(q-- > 0 ) {
            int g = Integer.parseInt(sc.nextLine().trim());
            System.out.println("DANH SACH NHOM " + g + ":");
            for (int i = 0 ; i < n ; i++){
                if (nhom[i] == g )
                    System.out.println(ma[i] + " " + ten[i] + " " + sdt[i]);
            }
            System.out.println("Bai tap dang ky: " + baiTap[g]);
        }
    }
}

import java.util.*;
public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nMon = Integer.parseInt(sc.nextLine().trim());
        for (int i=0; i < nMon; i++) sc.nextLine();

        int nGV = Integer.parseInt(sc.nextLine().trim());
        List<String> maGV = new ArrayList<>();
        Map<String, String> tenGV = new HashMap<>();
        Map<String, Double> tong = new HashMap<>();

        for (int i=0; i<nGV; i++){
            String[] p = sc.nextLine().trim().split("\\s+", 2);
            maGV.add(p[0]);
            tenGV.put(p[0], p[1]);
            tong.put(p[0], 0.0);
        }

        int nLop = Integer.parseInt(sc.nextLine().trim());
        for (int i=0; i<nLop; i++){
            String[] p = sc.nextLine().trim().split("\\s+");
            double gio = Double.parseDouble(p[2]);
            tong.put(p[0], tong.get(p[0]) + gio);
        }

        for (String ma : maGV){
            System.out.println(tenGV.get(ma) + " " + String.format(Locale.US, "%.2f", tong.get(ma)));
        }
    }
}

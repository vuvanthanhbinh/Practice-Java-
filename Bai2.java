import java.util.*;

public class bai2 {
    static class GV {
        String ma, ten, bm, last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<GV> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            GV g = new GV();
            g.ten = String.join(" ", sc.nextLine().trim().split("\\s+"));
            String[] w = g.ten.split(" ");
            g.last = w[w.length - 1];
            StringBuilder sb = new StringBuilder();
            for (String x : sc.nextLine().trim().split("\\s+"))
                sb.append(Character.toUpperCase(x.charAt(0)));
            g.bm = sb.toString();
            g.ma = String.format("GV%02d", i);
            ds.add(g);
        }
        ds.sort((a, b) -> {
            int c = a.last.compareTo(b.last);
            return c != 0 ? c : a.ma.compareTo(b.ma);
        });
        for (GV g : ds) System.out.println(g.ma + " " + g.ten + " " + g.bm);
    }
}
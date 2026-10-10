import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class baiTH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int test =1; test<=t; test++){
                int n = sc.nextInt();
                Map<Integer, Integer> map = new LinkedHashMap<>();
                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
                System.out.println("Test " + test + ":");
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
                }
            }
        }
        sc.close();
    }    
}

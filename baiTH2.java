import java.util.Scanner;

public class baiTH2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--> 0){
                long n = sc.nextLong();
                long sum = n*(n+1)/2;
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
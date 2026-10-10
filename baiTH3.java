import java.util.*;

public class baiTH3 {
    static int n ,k , cnt =0;
    static int[] a = new int[15];
    
    static void Try(int i , int start){
        for (int j = start ; j <= n -k+i; j++){
            a[i]=j;
            if (i == k ){
                StringBuilder sb = new StringBuilder();
                for (int t = 1 ; t <= k ; t++){
                    sb.append(a[t]);
                    if (t < k) sb.append(" ");
                }
                System.out.println(sb);
                cnt++;
            }else{
                Try (i+1 , j+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Try(1,1);
        System.out.println("Tong cong co " +cnt + " to hop");

    }
}

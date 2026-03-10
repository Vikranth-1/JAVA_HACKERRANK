import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            long current = a + b;
            StringBuilder sb = new StringBuilder();
            long step = b;
            
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(" ");
                sb.append(current);
                step *= 2;
                current += step;
            }
            
            System.out.println(sb);
        }
        
        sc.close();
    }
}

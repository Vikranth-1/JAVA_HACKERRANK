import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        BigInteger byteMin  = BigInteger.valueOf(Byte.MIN_VALUE);
        BigInteger byteMax  = BigInteger.valueOf(Byte.MAX_VALUE);
        BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
        BigInteger intMin   = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger intMax   = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger longMin  = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax  = BigInteger.valueOf(Long.MAX_VALUE);
        
        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            boolean fitted = false;
            StringBuilder sb = new StringBuilder();
            
            if (n.compareTo(byteMin) >= 0 && n.compareTo(byteMax) <= 0) {
                sb.append("* byte\n");
                fitted = true;
            }
            if (n.compareTo(shortMin) >= 0 && n.compareTo(shortMax) <= 0) {
                sb.append("* short\n");
                fitted = true;
            }
            if (n.compareTo(intMin) >= 0 && n.compareTo(intMax) <= 0) {
                sb.append("* int\n");
                fitted = true;
            }
            if (n.compareTo(longMin) >= 0 && n.compareTo(longMax) <= 0) {
                sb.append("* long\n");
                fitted = true;
            }
            
            if (fitted) {
                System.out.println(n + " can be fitted in:");
                System.out.print(sb);
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}

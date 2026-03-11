import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();
        
        // 1. Sum of lengths
        System.out.println(A.length() + B.length());
        
        // 2. Lexicographic comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Capitalize first letter of A and B
        String capA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(capA + " " + capB);
    }
}

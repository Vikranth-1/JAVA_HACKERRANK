import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        scanner.close();
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(password.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            
            System.out.println(sb.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

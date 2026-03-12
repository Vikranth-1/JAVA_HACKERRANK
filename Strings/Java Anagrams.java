import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() != b.length()) return false;

    int[] count = new int[26];
    
    for (char c : a.toCharArray()) count[c - 'a']++;
    for (char c : b.toCharArray()) count[c - 'a']--;
    
    for (int freq : count) {
        if (freq != 0) return false;
    }
    
    return true;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

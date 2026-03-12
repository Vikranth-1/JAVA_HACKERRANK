import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());

        // Matches <tag>content</tag> where content has no nested tags
        Pattern p = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

        while (n-- > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }
        in.close();
    }
}
